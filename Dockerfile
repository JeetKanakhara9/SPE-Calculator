FROM openjdk:8
COPY ./target/SPE-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
