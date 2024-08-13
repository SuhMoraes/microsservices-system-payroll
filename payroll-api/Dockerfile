FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar 
COPY target /app

ENTRYPOINT ["java", "-jar", "/app.jar"]
