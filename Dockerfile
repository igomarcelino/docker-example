FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY target/Java_Docker-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]