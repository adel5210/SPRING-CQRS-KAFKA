FROM openjdk:17
RUN ls -al .
RUN ls -al /
#RUN tree build/libs/
COPY build/libs/cqrs-kafka-0.0.1-SNAPSHOT.jar run.jar
RUN ls -al /
RUN tree /
ENTRYPOINT ["java", "-jar", "/run.jar"]