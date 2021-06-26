FROM openjdk:16
VOLUME /tmp
WORKDIR /usr/app
COPY ./build/libs/java-aws-0.0.1-SNAPSHOT.jar /usr/app/java-aws.jar
ENTRYPOINT ["java","-jar","/usr/app/java-aws.jar"]