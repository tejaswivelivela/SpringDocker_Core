FROM java:8
ADD /target/spring.jar spring.jar
ENTRYPOINT ["java", "-jar", "spring.jar"]
