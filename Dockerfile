FROM openjdk:17
COPY build/libs/cqrs-kafka-0.0.1-SNAPSHOT.jar run.jar
ENTRYPOINT ["java", "-jar", "/run.jar"]