FROM java:8
EXPOSE 8080
RUN mkdir /services-dashboard-app-folder
ADD /target/services-dashboard-1.0-SNAPSHOT.jar /services-dashboard-app-folder/services-dashboard.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/services-dashboard-app-folder/services-dashboard.jar"]
