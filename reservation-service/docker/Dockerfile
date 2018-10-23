FROM java:8
EXPOSE 8080
RUN mkdir /app
ADD /target/reservation-service-1.0-SNAPSHOT.jar /app/reservation-service.jar
WORKDIR /app
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app/reservation-service.jar"]
