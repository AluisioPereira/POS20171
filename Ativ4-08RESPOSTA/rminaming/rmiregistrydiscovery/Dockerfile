FROM openjdk:9-b181-jdk

MAINTAINER ajp

ENV PROJECT_PATH /opt/rmiregistrydiscovery

COPY ./target/rmiregistrydiscovery.jar ${PROJECT_PATH}/rmiregistrydiscovery.jar

CMD ["java", "-jar", "/opt/rmiregistrydiscovery/rmiregistrydiscovery.jar"]
