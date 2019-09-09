FROM openjdk:8-jdk-alpine as builder

COPY . /usr/src/app

RUN apk update
RUN apk add maven
WORKDIR /usr/src/app
COPY pom.xml /usr/src/app/pom.xml

COPY . /usr/src/app
WORKDIR /usr/src/app


RUN mvn package -DskipTests

FROM java:8-jdk

COPY --from=builder /usr/src/app/target/patient-medical-history-app-1.0.0.jar /usr/src/app/patient-medical-history-app-1.0.0.jar


WORKDIR /usr/src/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/src/app/patient-medical-history-app-1.0.0.jar"]
