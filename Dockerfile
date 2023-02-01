FROM ubuntu
RUN sudo apt-get install -y maven
RUN mvn clean install
