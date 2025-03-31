FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/ci-1.0-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]