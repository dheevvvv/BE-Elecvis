FROM openjdk:19-jdk
COPY build/libs/restful-api-0.0.1-SNAPSHOT.jar /app/application.jar
CMD ["java", "-jar", "/app/application.jar"]