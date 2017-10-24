FROM openjdk:8u131-jdk-alpine

MAINTAINER ajp

ENV PROJECT_PATH /opt/rmirproducer-0.1

COPY ./target/rmirproducer-0.1.jar ${PROJECT_PATH}/rmirproducer-0.1.jar	

CMD ["java", "-jar", "/opt/rmirproducer-0.1/rmirproducer-0.1.jar"]