FROM java:8
EXPOSE 8888
RUN mkdir -p /config-server-app-folder/config
ADD /target/config-server-1.0-SNAPSHOT.jar /config-server-app-folder/config-server.jar
ENTRYPOINT [\
"java",\
"-jar",\
"/config-server-app-folder/config-server.jar",\
"--eureka.client.service-url.defaultZone=http://booking-service-registry:8080/eureka",\
"--config.folder.location=/config-server-app-folder/config"\
]
