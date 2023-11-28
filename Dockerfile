FROM docker.io/amazoncorretto:17.0.9

ADD ./target/config-test-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx1000m", "-jar", "/app/config-test-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080