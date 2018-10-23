FROM java:8
EXPOSE 8080
RUN mkdir /app
ADD /target/service-registry-1.0-SNAPSHOT.jar /app/service-registry.jar
WORKDIR /app
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/app/service-registry.jar"]
