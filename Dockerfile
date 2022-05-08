FROM maven:3.5-jdk-8 as BUILD
 
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean compile package


FROM open-liberty:microProfile2-java11

COPY /src/main/liberty/config/server.xml /config/
COPY --from=BUILD /usr/src/app/target/*.war /config/apps/

EXPOSE 9080
EXPOSE 9443
