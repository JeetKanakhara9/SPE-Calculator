FROM openjdk:8
COPY ./target/SPE-Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPE-Calculator-1.0-SNAPSHOT.jar", "Main"]
