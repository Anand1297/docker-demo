# Base Java image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside container
WORKDIR /app

# Copy jar file into container
COPY target/docker-example-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8888

# Run Spring Boot app
ENTRYPOINT ["java","-jar","app.jar"]