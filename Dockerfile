FROM openjdk:17-alpine
COPY release/*.jar /run.jar
RUN ls -al /
ENTRYPOINT ["java", "-jar", "/run.jar"]