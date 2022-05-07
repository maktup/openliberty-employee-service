FROM websphere-liberty
USER root
ADD --chown=1001:0 target/*.war /config/apps/openliberty-employee-service.war 
ENV LICENSE accept
