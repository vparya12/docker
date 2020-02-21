#Start with base image as alpine java jre 
FROM openjdk:8-jre-alpine
# Name of Mainatiner
LABEL maintainer="vparya12@gmail.com"
#Port to expose on host system
EXPOSE 8085
#Jar file
ARG JAR_FILE=target/address.jar
#Adding jar file at root location in container
ADD ${JAR_FILE} address.jar
#Run the jar file
ENTRYPOINT ["java", "-jar", "/address.jar"]