FROM openjdk:11
EXPOSE 8080
ADD target/kubernete-test-1.0.0.jar kubernete-test-1.0.0.jar
ENTRYPOINT ["java", "-jar", "/kubernete-test-1.0.0.jar"]