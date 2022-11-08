FROM openjdk:18-jdk-alpine

ADD target/Group14-admin-cinemaControl-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-jar", "-DMYSQL_HOST=mysql","/app/Group14-admin-cinemaControl-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8082