FROM openjdk:17
COPY release/*.jar run.jar
ENTRYPOINT ["java", "-jar", "/run.jar"]