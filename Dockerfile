FROM ubuntu
RUN apt-get update
RUN apt-get install -y maven
RUN mvn clean install
