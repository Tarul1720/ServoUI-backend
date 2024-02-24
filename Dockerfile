FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/ServoUI-0.0.1-SNAPSHOT.jar ServoUI-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","ServoUI-0.0.1-SNAPSHOT.jar"]