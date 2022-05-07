FROM icr.io/appcafe/open-liberty:kernel-slim-java8-openj9-ubi
COPY --chown=1001:0  /src/main/liberty/config/server.xml /config/
#RUN features.sh
COPY --chown=1001:0  /target/*.war /config/apps/
RUN configure.sh