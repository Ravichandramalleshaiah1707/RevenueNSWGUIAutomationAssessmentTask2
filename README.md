This project demonstrates API automation testing using Rest Assured in Java (BDD style) within IntelliJ IDEA. 
The automation framework validates the Open Library API response for a specific author and asserts key elements in the
response body.

Source code folder:
1. src/test/java/apiTest - can be find both runners and step definitions and updated as per the API automation task.
2. pom and testng-api.xml - also updated as per API task and ready to run(clone and can run straight away).
3. feature file to use for API - apiAuthorNameResponseCheck.feature

Target API Endpoint:
https://openlibrary.org/authors/OL1A.json

Tech Stack:

Language: Java
1. Automation Tool: Rest Assured (BDD style)
2. Test Framework: TestNG
3. IDE: IntelliJ IDEA
4. Build Tool: Maven

API Request:
Method: GET

Assertions:
Validates personal_name and alternate_name fields.