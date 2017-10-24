FROM openjdk:8u131-jdk-alpine

MAINTAINER ajp

ENV PROJECT_PATH /opt/corbaproducer-0.1

COPY ./target/corbaproducer-0.1.jar ${PROJECT_PATH}/corbaproducer-0.1.jar	

CMD ["java", "-jar", "/opt/corbaproducer/corbaproducer-0.1.jar"]