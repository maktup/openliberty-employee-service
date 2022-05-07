FROM websphere-liberty
USER root
COPY --chown=1001:0 /src/main/liberty/config /config
ADD --chown=1001:0 target/*.war /config/apps/openliberty-employee-service.war 
ENV LICENSE accept
USER 1001
RUN configure.sh
