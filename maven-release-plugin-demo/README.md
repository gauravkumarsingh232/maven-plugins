# maven-release-plugin-demo
Demonstration of release plugin of maven

#### Ref: http://maven.apache.org/maven-release/maven-release-plugin/usage.html

```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-release-plugin</artifactId>
    <version>2.5.3</version>
</plugin>
````

#### Different Commands
```
mvn release:prepare
mvn release:prepare -DdryRun=true
mvn release:clean
mvn release:perform
mvn release:stage
mvn release:rollback
mvn release:update-versions
mvn release:update-versions -DautoVersionSubmodules=true
```

#### Create a Branch
```
mvn release:branch -DbranchName=my-branch
mvn release:branch -DbranchName=my-branch -DupdateBranchVersions=true -DupdateWorkingCopyVersions=false
```
