FROM openjdk:17
COPY build/libs/cqrs-kafka-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/cqrs-kafka-0.0.1-SNAPSHOT.jar"]