FROM ubuntu
RUN sudo yum install -y maven
RUN mvn clean install
