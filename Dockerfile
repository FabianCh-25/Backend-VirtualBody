FROM openjdk:19
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/VirtualBody-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} VirtualBody.jar
ENTRYPOINT ["java","-jar","/VirtualBody.jar"]