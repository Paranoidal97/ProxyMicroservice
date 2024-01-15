FROM eclipse-temurin:17-jdk-alpine
COPY target/ProxyMicroservice-0.0.1-SNAPSHOT.jar ProxyMicroservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ProxyMicroservice-0.0.1-SNAPSHOT.jar"]