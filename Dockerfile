FROM openjdk:17-alpine
COPY release/*.jar /run.jar
RUN ls -al /
ENV REDIS_URL=redis://default:f19c3a8aaea342c5be16418e1dc9c86c@gusc1-together-finch-30637.upstash.io:30637
ENV REDIS_PSSWD=f19c3a8aaea342c5be16418e1dc9c86c
ENV UPTASH_KAFKA_USER=ZmxleGlibGUtaGVuLTg1MzUkOW9XH5yzo8jOZLyYj3TUO_LDRhiYQyUOwNb0SOM
ENV UPTASH_KAFKA_PSSWD=a3d8f7958931416682b13e22f61f0352
ENV UPTASH_KAFKA_ENDPOINT=flexible-hen-8535-us1-kafka.upstash.io:9092
ENTRYPOINT ["java", "-jar", "/run.jar"]