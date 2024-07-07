# Maven web application project

### Java version: 11

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

### Adding jacoco plugin
```
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.8.7</version>
  <executions>
    <execution>
        <goals>
          <goal>prepare-agent</goal>
        </goals>
    </execution>
    <execution>
        <id>report</id>
        <phase>prepare-package</phase>
        <goals>
          <goal>report</goal>
        </goals>
    </execution>
  </executions>
</plugin>
```

### To generate jacoco code coverage report using maven
```
mvn jacoco:report
```

Code coverage report is located in target/site/jacoco/index.html

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

## Issues Faced
### Build failed with Java 21
```
WARNING Error injecting: org.apache.maven.plugin.war.WarMojo
com.google.inject.ProvisionException Unable to provision, see the following errors:

Error injecting constructor, java.lang.ExceptionInInitializerError: Cannot access defaults field of Properties
  at org.apache.maven.plugin.war.WarMojo.<init>(Unknown Source)
  while locating org.apache.maven.plugin.war.WarMojo
```
Fix: Use the latest plugin version
```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-war-plugin</artifactId>
  <version>3.3.1</version>
</plugin>
```