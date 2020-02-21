#Start with base image as alpine java jre 
FROM openjdk:8-jre-alpine
# Name of Mainatiner
LABEL maintainer="vparya12@gmail.com"
#Port to expose on host system
EXPOSE 8086
#Jar file
ARG JAR_FILE=target/job.jar
#Adding jar file at root location in container
ADD ${JAR_FILE} job.jar
#Run the jar file
ENTRYPOINT ["java", "-jar", "/job.jar"]