# Étape de build
FROM maven:3.9.3-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/accommodation-service.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
