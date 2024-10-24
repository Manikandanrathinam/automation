FROM eclipse-temurin:17
COPY target/dockerex.jar automation.jar
CMD [ "java", "-jar", "automation.jar" ]