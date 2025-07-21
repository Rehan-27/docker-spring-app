# Stage 1: Build from base image
FROM eclipse-temurin:17-jdk-alpine

# Copy jar file into image
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
