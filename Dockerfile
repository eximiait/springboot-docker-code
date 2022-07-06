FROM eclipse-temurin:11-jdk-alpine as builder
COPY . .
RUN ./gradlew assemble --no-daemon

FROM eclipse-temurin:11-jre-alpine
COPY --from=builder build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]