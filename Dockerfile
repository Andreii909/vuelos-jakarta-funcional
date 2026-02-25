FROM payara/server-full:7-jdk21

USER root
RUN apt-get update && apt-get install -y wget
RUN wget https://jdbc.postgresql.org/download/postgresql-42.7.2.jar -O /opt/payara/appserver/glassfish/domains/domain1/lib/postgresql.jar
USER payara

COPY setup.asadmin $POSTBOOT_COMMANDS
COPY target/contactos-crud-jakartaee.war $DEPLOY_DIR

ENV JVM_ARGS="-Xms256m -Xmx400m"
