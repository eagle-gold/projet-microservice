# Étape de build
FROM maven:3.9.3-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Étape de production
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/trip-service.jar app.jar

EXPOSE 8084
ENTRYPOINT ["java", "-jar", "app.jar"]
