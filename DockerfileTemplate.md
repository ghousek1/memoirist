# # Build stage
# # FROM maven:3.6.3-jdk-8-slim AS build
# FROM maven:3.6.3-jdk-11-slim AS build
# COPY src /app/src
# COPY pom.xml /app
# RUN mvn -v
# RUN mvn -f /app/pom.xml clean test package

# # Package stage
# # FROM openjdk:8-jdk-alpine
# # FROM openjdk:11-jre-slim-buster
# FROM adoptopenjdk/openjdk11-openj9:alpine
# COPY --from=build /app/target/*.jar /deployments/app.jar
# EXPOSE 9000
# ENTRYPOINT ["java","-jar","/deployments/app.jar"]



# ####
# # FROM adoptopenjdk/openjdk11-openj9:alpine
# # FROM maven:alpine

# # # image layer
# # WORKDIR /app
# # ADD pom.xml /app
# # # RUN mvn verify clean --fail-never
# # RUN mvn clean package

# # # Image layer: with the application
# # COPY . /app
# # RUN mvn -v
# # # RUN mvn clean install -DskipTests
# # RUN mvn clean package
# # EXPOSE 8080
# # ADD /target/spring-boot-docker-hello-world-0.0.1-SNAPSHOT.jar /developments/spring-boot-docker-hello-world-0.0.1-SNAPSHOT.jar
# # ENTRYPOINT ["java","-jar","/developments/spring-boot-docker-hello-world-0.0.1-SNAPSHOT.jar"]
