FROM eclipse-temurin:24-jre

WORKDIR /app

COPY target/springboot-labs-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]