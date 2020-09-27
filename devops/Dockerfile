FROM tomcat:8.0.51-jre8-alpine

VOLUME /tmp

EXPOSE 9999

ARG JAR_FILE=target/*.war

COPY ${JAR_FILE} /usr/local/tomcat/webapps/

CMD ["catalina.sh","run"]

MAINTAINER "suvradipdutta@gmail.com"