FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/samplepipe.jar samplepipe.jar
ENTRYPOINT ["java","-jar","/samplepipe.jar"]