#ARG CACHEBUST=1
#
FROM gradle:7.6.1-jdk17
#COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /app
COPY . /app
RUN gradle clean build --no-daemon  -x test
EXPOSE 8080
#FROM openjdk:17
#COPY --from=build /home/gradle/src/build/libs/*.jar .
#COPY build/libs/cqrs-kafka-0.0.1-SNAPSHOT.jar run.jar
#WORKDIR .
#RUN chmod -R 777 /cqrs-kafka-0.0.1-SNAPSHOT.jar
#RUN ls -al /
#RUN echo $CACHEBUST
CMD ["sh", "start.sh"]