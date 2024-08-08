"# SeleniumPOMFramework" 

This framework covers the following :

a) Tool used - Selenium

b) Langugae - Java

c) Design Pattern - Page Object Model

d) Build Tool - Maven

e) Framework - TestNG


+--------------------------------+
|         Test Execution          |
|          (TestNG Suite)         |
|  - Load TestNG Configuration    |
|  - Initialize Test Runner        |
+--------------------------------+
                |
                v
+--------------------------------+
|        Base Test Class          |
|  - Setup WebDriver              |
|  - Teardown WebDriver           |
+--------------------------------+
                |
                v
+--------------------------------+
|       Page Object Model         |
|        (POM Classes)            |
|  - Page Classes (e.g., LoginPage,|
|    ProfilePage)                 |
|  - Base Page Class              |
|    (Common Actions)             |
+--------------------------------+
                |
                v
+--------------------------------+
|      Test Data Management       |
|        (Data Providers)         |
|  - Read Data from Excel         |
|  - Provide Data to Test Methods |
+--------------------------------+
                |
                v
+--------------------------------+
|        Reporting and Logging    |
|         (Extent Reports)        |
|  - Capture Test Execution Logs  |
|  - Generate Test Reports        |
+--------------------------------+
                |
                v
+--------------------------------+
|      Build Tool (Maven)         |
|  - Manage Dependencies           |
|  - Build and Package            |
|  - Execute Tests                |
+--------------------------------+
                |
                v
+--------------------------------+
|      Selenium WebDriver         |
|  - Interact with Browser        |
|  - Perform UI Actions           |
|  - Capture Screenshots          |
+--------------------------------+


**Test Execution (TestNG Suite)**

Role: Manages the execution of test cases. It organizes and runs the tests according to the configuration defined in testng.xml.
Responsibilities:
Load the TestNG configuration.
Initialize and manage the test suite.
Components:
testng.xml: Configuration file that specifies test classes and methods to be executed.
Execution Flow:

TestNG initializes and loads the suite configuration.
Test cases are picked up and executed based on the configuration.
**Base Test Class**

Role: Provides setup and teardown functionality for all tests.
Responsibilities:
Initialize WebDriver.
Perform browser setup (e.g., maximize window).
Clean up after tests by closing the browser.
Components:
@BeforeMethod / @BeforeClass: Initialize WebDriver.
@AfterMethod / @AfterClass: Clean up resources.
Execution Flow:

WebDriver setup is performed before each test method.
WebDriver is closed after each test method.
**Page Object Model (POM)**

Role: Encapsulates page-specific functionality and elements in separate classes.
Responsibilities:
Define page-specific actions and elements.
Implement common actions in a base page class.
Components:
Page Classes: Represent individual web pages (e.g., LoginPage, ProfilePage).
Base Page Class: Contains common methods used by page classes (e.g., click, type).
Execution Flow:

Test methods interact with the page classes to perform actions on the web pages.
Common methods from the base page class are utilized in page-specific classes.
**Test Data Management**

Role: Provides data-driven testing capabilities by supplying test data.
Responsibilities:
Read data from external sources (e.g., Excel).
Use @DataProvider to pass data to test methods.
Components:
Data Providers: Methods annotated with @DataProvider that supply data.
Excel Reader: Utility class to read test data from Excel files.
Execution Flow:

Data is read from Excel and provided to test methods.
Test methods use the data to perform actions and verifications.
Reporting and Logging (Extent Reports)

Role: Generate detailed and interactive test reports.
Responsibilities:
Log test results and steps.
Capture screenshots and other relevant information.
Generate and save HTML reports.
Components:
**Extent Reports:** Library used to create and manage test execution reports.
Execution Flow:

Logs and results are captured during test execution.
Reports are generated and saved after all tests are completed.
**Build Tool (Maven)**

Role: Manages project dependencies and build lifecycle.
Responsibilities:
Define project dependencies (e.g., Selenium, TestNG).
Build and package the project.
Execute tests as part of the build process.
Components:
pom.xml: Maven configuration file defining dependencies and build configurations.
Execution Flow:

Maven resolves dependencies and builds the project.
Maven executes test cases as defined in the project configuration.
**Selenium WebDriver**

Role: Provides the capability to interact with web browsers.
Responsibilities:
Perform UI actions like clicking buttons, entering text, and navigating pages.
Capture screenshots and manage browser interactions.
Components:
WebDriver: Interface for controlling the browser.
Browser Drivers: Implementations for different browsers (e.g., ChromeDriver, GeckoDriver).
Execution Flow:

Selenium WebDriver executes actions on the web browser based on instructions from page classes.
WebDriver manages browser sessions and captures results.

**Summary**
Test Execution: Managed by TestNG, which organizes and runs the test cases.
Setup and Teardown: Handled by the Base Test Class, initializing and closing WebDriver.
Page Object Model: Encapsulates web page interactions and elements in separate classes.
Test Data Management: Provides data-driven testing through Excel or other data sources.
Reporting and Logging: Extent Reports generate detailed test reports and logs.
Build Tool: Maven handles project dependencies, builds, and test executions.
Selenium WebDriver: Executes UI actions on the browser and manages browser sessions.
This architecture ensures a modular and maintainable framework, separating concerns and allowing for efficient test development and execution.
