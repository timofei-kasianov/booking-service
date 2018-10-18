FROM java:8
EXPOSE 8080
RUN mkdir /reservation-service-app-folder
ADD /target/reservation-service-1.0-SNAPSHOT.jar /reservation-service-app-folder/reservation-service.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/reservation-service-app-folder/reservation-service.jar"]
