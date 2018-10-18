FROM java:8
EXPOSE 8080
RUN mkdir /geo-location-service-app-folder
ADD /target/geo-location-service-1.0-SNAPSHOT.jar /geo-location-service-app-folder/geo-location-service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/geo-location-service-app-folder/geo-location-service.jar"]
