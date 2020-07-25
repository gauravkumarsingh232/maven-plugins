Find out version of plugin in POM

```
The help:describe Goal
```

The describe goal is used to discover information about Maven plugins. Given either a plugin or a groupId, an artifactId and optionally a version, the goal will lookup that plugin and output details about it. If the user also specifies which goal to describe, the describe goal will limit output to the details of that goal, including parameters.


Example:
```
mvn help:describe -Dplugin=org.apache.maven.plugins:maven-deploy-plugin
```
Result:

```
Name: Apache Maven Deploy Plugin
Description: Uploads the project artifacts to the internal remote repository.
Group Id: org.apache.maven.plugins
Artifact Id: maven-deploy-plugin
Version: 3.0.0-M1
Goal Prefix: deploy
```


References:
1. https://maven.apache.org/plugins/maven-help-plugin/usage.html