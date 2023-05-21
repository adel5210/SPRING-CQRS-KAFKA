FROM openjdk:17
RUN pwd
WORKDIR .
RUN pwd
COPY build/libs/cqrs-kafka-0.0.1-SNAPSHOT.jar run.jar
RUN ls -al /
ENTRYPOINT ["java", "-jar", "/run.jar"]