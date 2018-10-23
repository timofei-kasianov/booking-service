FROM java:8
EXPOSE 8888
RUN mkdir -p /app/config
COPY /config/ /app/config/
ADD /target/config-server-1.0-SNAPSHOT.jar /app/config-server.jar
WORKDIR /app
ENTRYPOINT [\
"java",\
"-jar",\
"/app/config-server.jar",\
"--eureka.client.service-url.defaultZone=http://service-registry:8080/eureka",\
"--config.folder.location=/app/config"\
]
