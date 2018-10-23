FROM java:8
EXPOSE 8080
RUN mkdir /app
ADD /target/api-gateway-1.0-SNAPSHOT.jar /app/api-gateway.jar
WORKDIR /app
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app/api-gateway.jar"]
