FROM eclipse-temurin:21.0.3_9-jre-alpine


LABEL authors="thiagodd"

COPY build/libs/*.jar apolohealthcare.jar

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ENTRYPOINT ["java", "-jar", "apolohealthcare.jar"]