FROM java:8
EXPOSE 8080
RUN mkdir /accommodation-service-app-folder
ADD /target/accommodation-service-1.0-SNAPSHOT.jar /accommodation-service-app-folder/accommodation-service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/accommodation-service-app-folder/accommodation-service.jar"]
