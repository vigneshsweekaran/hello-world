FROM tomcat:8-jre8 

COPY ./target/hello-world-*.war /usr/local/tomcat/webapps/hello-world.war
