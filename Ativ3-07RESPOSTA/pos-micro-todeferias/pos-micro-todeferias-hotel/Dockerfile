FROM payara/server-full
ENV DOMAIN domain1
ENV LIB /opt/payara41/glassfish/domains/${DOMAIN}/lib/
ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/
#ADD target/pos-micro-todeferias-passagem-0.1/WEB-INF/lib/ ${LIB}
ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
ADD target/pos-micro-todeferias-passagem-0.1.war  ${DEPLOY}