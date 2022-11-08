FROM openjdk:17-jdk-alpine

ADD target/Group14-travel-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-jar","-DREDIS_HOST=redis", "/app/Group14-travel-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081