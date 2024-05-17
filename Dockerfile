FROM eclipse-temurin:21-alpine

COPY . .

RUN ./gradlew bootJar

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ENTRYPOINT ["java", "-jar", "/build/libs/apolo-health-care-0.0.1.jar"]