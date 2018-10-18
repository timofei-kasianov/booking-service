FROM java:8
EXPOSE 8080
RUN mkdir /service-registry-app-folder
ADD /target/service-registry-1.0-SNAPSHOT.jar /service-registry-app-folder/service-registry.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/service-registry-app-folder/service-registry.jar"]
