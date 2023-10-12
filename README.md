# Maven web application project

### Clean fresh application code is available in hell-world-maven branch and hello-world-maven tag
To clone the hello-world-maven branch
```
git clone -b hello-world-maven https://github.com/vigneshsweekaran/hello-world.git
```
### To generate the package
```
mvn clean package
```
### War file is generated in target/hello-world.war

### Adding jackson library

```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
</dependency>
```

## Github Actions
Topic|Branch name| 
|----|-----|
|First pipeline|first-pipeline|
|How to build a maven project|maven-build|
|How to define parallel jobs|parallel-jobs|
|How to depend on another job|needs|
|How to pass artifacts from one job to another|publishartifacts|
|How to use different agent pool for jobs or stages|agentpool-jobs|
|How to build a maven project and cache the dependencies|maven-build-cache|
|How to build a Docerfile and push to dockerhub|maven-docker-build-push|
|How to build a Docerfile and push to Jfrog|maven-docker-build-push-jfrog|
|How to deploy the container to a server|maven-build-deploy|
|Deploy to kubernetes using kubectl using ssh|deploy-k8s-kubectl-ssh|
|Build helm chart from piepline and push to jfrog helm repository|helm-jfrog|
|Deploy to kubernetes using helm using ssh|deploy-k8s-helm-ssh|

Tested polling for polling
