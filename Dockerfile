FROM openjdk:17

COPY target/restDemo-0.0.1-SNAPSHOT.jar /app/restDemo.jar

EXPOSE 8080

WORKDIR /app

CMD ["java", "-jar", "restDemo.jar"]