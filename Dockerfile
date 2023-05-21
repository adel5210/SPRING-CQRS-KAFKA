FROM gradle:8.1.1-jdk17
WORKDIR /app
COPY . /app
RUN gradle build
EXPOSE 8080
CMD ["sh", "start.sh"]