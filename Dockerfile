FROM openjdk:17
CMD ["java","--version"]
ENTRYPOINT ["java", "-jar", "run.jar"]