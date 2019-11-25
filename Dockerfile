FROM openjdk:13-jdk-alpine
ADD target/integrate-0.0.1-SNAPSHOT.jar integrate-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "integrate-0.0.1-SNAPSHOT.jar"]