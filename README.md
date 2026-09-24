<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:2c5364,100:00b09b&height=220&section=header&text=Parabank%20Automation&fontSize=48&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Data-Driven%20Selenium%20Test%20Automation%20Framework&descAlignY=58&descSize=18" width="100%"/>

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&duration=2500&pause=800&color=2C5364&center=true&vCenter=true&width=650&lines=Selenium+%2B+TestNG+%2B+Maven;Page+Object+Model+Architecture;Excel-Driven+Test+Scenarios;No-Code+Test+Case+Additions" alt="Typing SVG" />

<br/>

[![Java](https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-WebDriver-43B02A?style=for-the-badge&logo=selenium)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-Framework-orange?style=for-the-badge)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Build-Maven-C71A36?style=for-the-badge&logo=apachemaven)](https://maven.apache.org/)
[![Apache POI](https://img.shields.io/badge/Data--Driven-Apache%20POI-blue?style=for-the-badge)](https://poi.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](#license)

<br/>

![Profile Views](https://komarev.com/ghpvc/?username=parabank-automation&label=Repo%20Views&color=2c5364&style=flat-square)
[![GitHub stars](https://img.shields.io/github/stars/Jothirupan/parabank-automation?style=social)](https://github.com/Jothirupan/parabank-automation/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Jothirupan/parabank-automation?style=social)](https://github.com/Jothirupan/parabank-automation/network/members)

<br/>

[Overview](#-overview) •
[Tech Stack](#-tech-stack) •
[Project Structure](#-project-structure) •
[Getting Started](#-getting-started) •
[Running Tests](#-running-tests) •
[Reports](#-test-reports) •
[Contributing](#-contributing)

</div>

<img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/rainbow.gif" width="100%">

---

## 📖 Overview

**Parabank Automation** is a Selenium WebDriver-based UI test automation framework built for the [Parabank](https://parabank.parasoft.com/) demo banking application. It follows the **Page Object Model (POM)** design pattern and uses **data-driven testing** so QA engineers can add new test scenarios by editing an Excel file — no code changes required.

### ✨ Key Features

- 🧩 **Page Object Model** architecture for clean separation of test logic and UI locators
- 📊 **Data-Driven Testing** via Apache POI — drive scenarios directly from Excel (`.xlsx`)
- ⚙️ **TestNG** suite management with configurable, parallel-ready execution
- 📁 Centralized, reusable base classes and utility methods
- 📝 Auto-generated **TestNG HTML/XML reports** after every run
- 🔧 **Maven**-managed dependencies and build lifecycle
- 🌐 Cross-browser support (Chrome / Firefox)

---

## 🛠 Tech Stack

| Category | Technology |
|---|---|
| **Language** | Java 8+ |
| **Test Framework** | TestNG |
| **Build Tool** | Maven |
| **Browser Automation** | Selenium WebDriver |
| **Data-Driven Testing** | Apache POI (Excel) |
| **IDE** | Eclipse |

---

## 📂 Project Structure

```
parabank-automation/
├── src/
│   ├── main/java/                        # Page objects, utilities, base classes
│   └── test/
│       ├── java/                         # TestNG test classes
│       │   └── dataDrivenTesting/
│       │       └── DDT_From_Excel_File.java
│       └── resources/                    # Test data files (e.g., TestScriptData.xlsx)
├── test-output/                          # TestNG execution reports (generated)
├── target/                               # Compiled build output (git-ignored)
├── pom.xml                               # Maven dependencies & build config
└── testng.xml                            # TestNG suite configuration
```

---

## ✅ Prerequisites

Make sure the following are installed before setup:

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [Eclipse IDE](https://www.eclipse.org/downloads/) with **TestNG** and **EGit** plugins
- Chrome/Firefox browser with a matching WebDriver version

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/<your-username>/parabank-automation.git
   cd parabank-automation
   ```

2. **Import into Eclipse**
   `File > Import > Existing Maven Projects` → select the cloned folder

3. **Resolve dependencies**
   Right-click the project → `Maven > Update Project`

4. **Configure environment**
   Update base URL, credentials, and file paths in the relevant config/properties file as needed

---

## ▶️ Running Tests

**Option 1 — Via Eclipse**
Right-click `testng.xml` → **Run As → TestNG Suite**

**Option 2 — Via Maven CLI**
```bash
mvn test
```

> 💡 Test data is read from Excel files in `src/test/resources/`. To add a new scenario, simply add a row to the Excel file — no code changes required.

---

## 📊 Test Reports

After execution, TestNG automatically generates reports in the `test-output/` directory:

- `test-output/index.html` — interactive summary report
- `test-output/emailable-report.html` — shareable summary report

---

## 🗂 Data-Driven Testing

Test scenarios are driven from `TestScriptData.xlsx` and parsed using **Apache POI** inside [`DDT_From_Excel_File.java`](src/test/java/dataDrivenTesting/DDT_From_Excel_File.java).

To add a new test case:
1. Open the Excel data file in `src/test/resources/`
2. Add a new row with the required test parameters
3. Run the suite — no code changes needed

---

## 🗺 Roadmap

- [ ] Integrate CI/CD pipeline (GitHub Actions / Jenkins)
- [ ] Add cross-browser parallel execution
- [ ] Extend reporting with Extent/Allure reports
- [ ] Add Dockerized execution environment

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

## 👤 Author

**Mathubalan K**

[![GitHub](https://img.shields.io/badge/GitHub-Mathubalan18-181717?style=for-the-badge&logo=github)](https://github.com/Mathubalan18)

<div align="center">

### ⭐ If you find this project useful, consider giving it a star!

<img src="https://media.giphy.com/media/LnQjpWaON8nhr21vNW/giphy.gif" width="120">

</div>

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:00b09b,50:2c5364,100:0f2027&height=150&section=footer&animation=fadeIn"/>
