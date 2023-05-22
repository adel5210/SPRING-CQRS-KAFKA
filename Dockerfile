FROM openjdk:17-alpine
COPY release/*.jar /app/run.jar
RUN ls -al /app
ENTRYPOINT ["java", "-jar", "run.jar"]