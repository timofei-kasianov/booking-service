FROM java:8
EXPOSE 8080
RUN mkdir /app
ADD /target/services-dashboard-1.0-SNAPSHOT.jar /app/services-dashboard.jar
WORKDIR /app
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app/services-dashboard.jar"]
