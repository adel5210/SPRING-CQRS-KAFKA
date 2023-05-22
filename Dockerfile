FROM ghcr.io/graalvm/jdk:java17-22.2.0
COPY release/*.jar run.jar
ENTRYPOINT ["java", "-jar", "/run.jar"]