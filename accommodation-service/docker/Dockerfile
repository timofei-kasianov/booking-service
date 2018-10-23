FROM java:8
EXPOSE 8080
RUN mkdir /app
ADD /target/accommodation-service-1.0-SNAPSHOT.jar /app/accommodation-service.jar
WORKDIR /app
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app/accommodation-service.jar"]
