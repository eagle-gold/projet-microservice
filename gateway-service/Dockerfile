# Étape 1 : builder
FROM maven:3.9.3-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/gateway-service.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
