# Java 21 Maven web application project

### To generate the package
```
mvn clean package
```

### War file is generated in target/hello-world-1.0-SNAPSHOT.war

### Adding jacoco plugin
```
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.8.12</version>
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