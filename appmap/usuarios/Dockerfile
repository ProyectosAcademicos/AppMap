FROM eclipse-temurin:21-jdk-alpine

COPY . .

RUN ./mvnw clean package

CMD ["java", "-jar", "target/usuarios-0.0.1-SNAPSHOT.jar"] 