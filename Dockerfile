FROM openjdk:17-jdk-slim


EXPOSE 8080

ADD target/playingwithnumbers-0.0.1-SNAPSHOT.jar playingwithnumbers-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-jar", "playingwithnumbers-0.0.1-SNAPSHOT.jar" ]