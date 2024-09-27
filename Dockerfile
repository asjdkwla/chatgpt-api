FROM maven as builder
WORKDIR /chatgpt-api
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests
CMD ["java","-jar","/chatgpt-api/target/chatgpt-api.jar","--spring.profiles.active=prod"]