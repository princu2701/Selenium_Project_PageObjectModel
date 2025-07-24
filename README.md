# Selenium_Project_PageObjectModel

## Overview

Selenium_Project_PageObjectModel is a Selenium WebDriver–based testing framework that applies the Page Object Model (POM) design pattern and TestNG for structured, maintainable automated tests. It automates end-to-end scenarios in the Car and Bike Accessories sections of the target website.

## Features

- Page Object Model (POM) for clear separation of page structure and test logic
- ExtentReports for detailed HTML test reports
- TestNG for test configuration, grouping, and execution
- Maven for build and dependency management

## Technologies Used

- Selenium WebDriver (Java)
- TestNG
- PageFactory (Selenium Support)
- ExtentReports
- Maven

## Prerequisites

Ensure you have the following installed/configured:

- Java JDK 8 or higher
- Maven
- Google Chrome browser
- Chromedriver executable on your system PATH or set via a system property
- An IDE such as IntelliJ IDEA or Eclipse (optional)

## Setup

1. **Clone the repository**:

   ```bash
   git clone https://github.com/princu2701/Selenium_Project_PageObjectModel.git
   ```

2. **Change into the project directory**:

   ```bash
   cd Selenium_Project_PageObjectModel
   ```

3. **Configure Chromedriver**:
   - Download the Chromedriver binary matching your Chrome version.
   - Place it in a directory on your `PATH`, or set the location when launching:
     ```bash
     export webdriver.chrome.driver=/path/to/chromedriver
     ```

## Configuration

Edit the `src/test/resources/config.properties` file to provide runtime values:
```properties
url=https://www.naaptol.com
search1=<search term for brand search>
pin1=<valid pincode>
pin2=<invalid pincode>
head=<header search keyword>
```

## Running Tests

Run the test suite with Maven:

```bash
mvn clean test
```

### Reports

- **ProjectReport.html**: ExtentReports dashboard in the project root.
- **target/surefire-reports/index.html** and **emailable-report.html**: TestNG suite results.

## License

This project is licensed under the MIT License.