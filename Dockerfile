FROM openjdk
COPY target/app.jar .
ENTRYPOINT ["java","-jar","/app.jar"]