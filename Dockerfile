FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.war"]
