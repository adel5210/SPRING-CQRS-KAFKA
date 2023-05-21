ARG CACHEBUST=1

FROM gradle:7.6.1-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean build --no-daemon -x test

FROM openjdk:17
COPY --from=build /home/gradle/src/build/libs/*.jar .
WORKDIR .
RUN chmod -R 777 /cqrs-kafka-0.0.1-SNAPSHOT.jar
RUN ls -al /
RUN echo "$CACHEBUST"
ENTRYPOINT ["java", "-jar", "/cqrs-kafka-0.0.1-SNAPSHOT.jar"]