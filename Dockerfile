FROM gradle:7.6.1-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/run.jar
ENTRYPOINT ["java", "-jar", "/app/run.jar"]