FROM maven:3.6.3-jdk-8 as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:8-jre-slim
COPY --from=build /target/blog-app-apis-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
# Set the environment variable
ENV SPRING_DATASOURCE_PASSWORD=pscale_pw_H5qYdw60xQfJ3YBJyIZbIwfQ7851l57gvTUBNDaG2Tj
ENTRYPOINT ["java","-jar","demo.jar"]

