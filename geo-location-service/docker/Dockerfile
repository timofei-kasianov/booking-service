FROM java:8
EXPOSE 8080
RUN mkdir /app
ADD /target/geo-location-service-1.0-SNAPSHOT.jar /app/geo-location-service.jar
WORKDIR /app
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app/geo-location-service.jar"]
