FROM openjdk:8u131-jdk-alpine

MAINTAINER ajp

ENV PROJECT_PATH /opt/corbaconsumer-0.1

COPY ./target/corbaconsumer-0.1.jar ${PROJECT_PATH}/corbaconsumer-0.1.jar	

CMD ["java", "-jar", "/opt/corbaconsumer/corbaconsumer-0.1.jar"]