FROM gradle:7.6.1-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon -x test

FROM openjdk:17
COPY --from=build /home/gradle/src/build/libs/*.jar .
WORKDIR .
RUN ls -al /
ENTRYPOINT ["java", "-jar", "/run.jar"]