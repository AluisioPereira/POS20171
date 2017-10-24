FROM openjdk:8u131-jdk-alpine

MAINTAINER ajp

ENV PROJECT_PATH /opt/rmirconsumer-0.1

COPY ./target/rmirconsumer-0.1.jar ${PROJECT_PATH}/rmirconsumer-0.1.jar	

CMD ["java", "-jar", "/opt/rmirconsumer-0.1/rmirconsumer-0.1.jar"]