# Use a multi-stage build to optimize the final image size

# Step 1: Build the JAR file
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Create the final image
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/ThisWebsiteWillSelfDestruct-0.0.1-SNAPSHOT.jar /app/ThisWebsiteWillSelfDestruct.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/ThisWebsiteWillSelfDestruct.jar"]
