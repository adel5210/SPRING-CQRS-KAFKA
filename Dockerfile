FROM openjdk:17-alpine
COPY release/*.jar run.jar
ENTRYPOINT ["java", "-jar", "/run.jar"]