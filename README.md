Service NSW Stamp Duty Popup Validation
Overview
This project automates the Vehicle Stamp Duty Calculator on Service NSW using Selenium WebDriver, Cucumber (BDD), and TestNG.
It demonstrates GUI automation, Page Object Model (POM), and data-driven testing via feature files and properties.


Prerequisites
Java JDK 11 or higher
Maven
IntelliJ IDEA (Community or Ultimate)
Chrome Browser
Git

Setup Instructions:

1. Clone the repository
git clone https://github.com/Ravichandramalleshaiah1707/RevenueNSWGUIAutomationAssessmentTask2.git
cd RevenueNSWGUIAutomationAssessmentTask2
2. Import project into IntelliJ IDEA
Select Open → Choose project root folder → OK
Maven should automatically download dependencies.
3. Check dependencies
Ensure selenium-java, cucumber-java, cucumber-testng, testng, and webdrivermanager are in pom.xml.
4. Set ChromeDriver
You can use WebDriverManager (recommended) or set chromedriver path in your DriverFactory.

   
Data-driven Features:
1. Input values (e.g., Yes and vehicle amount) are in feature files.
2. Locators are in properties files under src/test/resources.
3. No hardcoded values in page objects or step definitions.

Assertions & Logging:
1. Assertions are done using TestNG Assert
2. Success messages print to console

Notes:
1. Do not commit target/ or .idea/ folders. They are in .gitignore.
2. Anyone cloning the repo can immediately run tests after setting up JDK, Maven, and Chrome.