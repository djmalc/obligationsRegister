# Creates the minimum environment to package and run this Skyve application.
# Note that this uses an in-memory database and is only useful for demonstration/development.
FROM bizhubaustralia/skyve-wildfly-postgresql:32.0.1.Final

ENV LANG en_US.UTF-8

USER root
RUN mkdir /content
RUN chown jboss:jboss /content

RUN mkdir -p /opt/skyve/addins/
RUN chown jboss:jboss /opt/skyve/addins/

USER jboss
ADD skyve-content-9.0.0.zip /opt/skyve/addins/skyve-content-9.0.0.zip
ADD obligationsRegister.war /opt/jboss/wildfly/standalone/deployments/obligationsRegister.war
ADD obligationsRegister.json /opt/jboss/wildfly/standalone/deployments
RUN touch /opt/jboss/wildfly/standalone/deployments/obligationsRegister.war.dodeploy

ENV SKYVE_CONTENT='/content/' \
    SKYVE_DATASTORE_DIALECT='org.skyve.impl.persistence.hibernate.dialect.PostgreSQL95SpatialDialect' \
    DATABASE_URL='obligationsRegister_db' \
    SKYVE_SECURITY_DOMAIN_NAME='obligationsRegister' \
    SKYVE_JNDI_NAME='obligationsRegisterDB'

ENTRYPOINT [ "entrypoint.sh" ]
CMD [ "/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-Djava.locale.providers=COMPAT,CLDR" ]
