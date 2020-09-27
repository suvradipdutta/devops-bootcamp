FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 8888

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} springboot.jar

RUN echo "Docker image creation started, please hold on for a moment........."

ENTRYPOINt ["java", "-jar", "springboot.jar"]

MAINTAINER "suvradipdutta@gmail.com"