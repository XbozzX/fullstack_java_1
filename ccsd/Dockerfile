# ----- Build stage -------
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests


# ----- Runtime stage ------
FROM eclipse-temurin:17-jre
WORKDIR /app
EXPOSE 8082

COPY --from=builder /app/target/*.jar app.jar
CMD [ "java", "-jar", "app.jar"]

