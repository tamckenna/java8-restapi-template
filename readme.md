# Application Template 

An application template

* Server is started up at:
    * Class:  [com.example.Application](src/main/java/com/example/Application.java)
    * Method: ``` public static void main(String[] args) ```
* The REST controllers can be found at: [com.example.controller](src/main/java/com/example/controller)
    * The RootController is at: [com.example.controller.RootController](src/main/java/com/example/controller/RootController.java)
* Security is defined in the class: [com.example.config.SecurityConfig](src/main/java/com/example/config/SecurityConfig.java)
* Unit Tests are located at: [src/test/java/com/example](src/test/java/com/example)
* Defaults to port: __8080__ to not interfere with other Guidewire applications

---

## Application Properties

Can be edited in the [gradle.properties](gradle.properties) file

* Group Name: __com.example__
* Project Name: __application-template__

---

## Application Build

```
./gradlew fullBuild
```

* Artifact Output: ``` build/libs/application-template.war ```
* Unit Tests Report: ``` build/reports/tests/index.html ```
* Code Coverage Report (Clover): ``` build/reports/clover/html/index.html ```
* Code Quality Report (PMD): ``` build/reports/pmd/main.html ```
* Bug Report (SpotBugs): ``` build/reports/spotbugs/spotbugs.html ```
