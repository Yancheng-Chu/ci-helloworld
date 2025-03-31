FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/ci-helloworld-1.0-SNAPSHOT-jar-with-dependencies.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]