FROM icr.io/appcafe/open-liberty:full-java11-openj9-ubi

COPY --chown=1001:0 src/main/resources/*.jar /opt/ol/wlp/usr/shared/resources/
COPY --chown=1001:0 src/main/liberty/config /config/
COPY --chown=1001:0 target/core-db-1.war /config/apps
RUN configure.sh
