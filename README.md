This project demonstrates API automation testing using Rest Assured in Java (BDD style) within IntelliJ IDEA. The automation framework validates the Open Library API response for a specific author and asserts key elements in the response body.

Source code folder:
src/test/java/apiTest - can be find both runners and step definitions and updated as per the API automation task
pom and testng-api.xml - also updated as per API task and ready to run(clone and can run straight away).

Target API Endpoint:
https://openlibrary.org/authors/OL1A.json

Tech Stack:

Language: Java
Automation Tool: Rest Assured (BDD style)
Test Framework: TestNG (or JUnit, depending on your setup)
IDE: IntelliJ IDEA
Build Tool: Maven/Gradle

API Request:
Method: GET

Assertions:
Validates personal_name and alternate_name fields.