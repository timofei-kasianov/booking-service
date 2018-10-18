FROM java:8
EXPOSE 8080
RUN mkdir /api-gateway-app-folder
ADD /target/api-gateway-1.0-SNAPSHOT.jar /api-gateway-app-folder/api-gateway.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/api-gateway-app-folder/api-gateway.jar"]
