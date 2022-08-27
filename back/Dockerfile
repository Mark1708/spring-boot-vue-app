FROM maven:3.6.3-jdk-11 AS builder
COPY ./ ./
RUN mvn clean package -DskipTests
FROM openjdk:11.0.7-jdk-slim
COPY --from=builder /target/back-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]