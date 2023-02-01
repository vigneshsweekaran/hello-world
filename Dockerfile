FROM ubuntu
RUN apt-get update
RUN apt-get install -y git
RUN git clone https://github.com/prajwal1691/hello-world.git
RUN apt-get install -y maven
WORKDIR /hello-world
RUN mvn clean install
