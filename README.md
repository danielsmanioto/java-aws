# java-aws

# Tecnologies 

Java16 <br>
Spring boot <br>
Gradle <br>
Docker <br>

# Add plugins in your IDE Intellij
AWS Tool Kit; <br>
Lombok; <br>
Docker; <br>
SonarLint. <br>

# External accounts

AWS Account :   <br>
Docker Hub Account :  https://hub.docker.com/  <br>
Travis CI: https://travis-ci.org/ <br>

# Executing 

`curl localhost:8080/actuator/health`

`curl localhost:8080/users/hello`

# Run local

 ./gradlew bootRun
 
# Dockers images 

https://hub.docker.com/repository/docker/danielsmanioto/java-aws <br>

# Deploy on Docker container 

`./gradlew build`

`docker build --tag=danielsmanioto/java-aws .`

`docker run -d -p 80:8080 -t danielsmanioto/java-aws `

# Instaling CLI and CDK 
https://docs.aws.amazon.com/cli/latest/userguide/install-cliv2-linux.html <br>
https://docs.aws.amazon.com/cli/latest/userguide/install-cliv2-windows.html <br>


# CI / CD / Travos CI

file .travis.ci

