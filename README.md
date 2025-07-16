# 🚀 Selenium Java Hybrid Automation Framework

🎯 **Project Name:** *Tutorials Ninja - Self-Upskilling Automation Project*  
💻 **Tech Stack:** Java + Selenium + TestNG + Maven + .properties Handling  
📁 **Framework Type:** Hybrid (Modular + Data-Driven + POM)

---

## 📌 Objective

This project is part of my **automation upskilling journey**, where I focus on building a clean and scalable **Selenium framework using Java**. It starts with TestNG and `.properties` file support — and later, I will extend it to **Python** and **Playwright**.

---

## 🛠️ Tech Stack & Tools

| Tool/Technology | Purpose                        |
|------------------|-------------------------------|
| ☕ Java           | Programming Language          |
| 🌐 Selenium       | Browser Automation            |
| ⚙️ TestNG          | Testing Framework             |
| 📦 Maven          | Build & Dependency Management |
| 🗂️ .properties    | External Configurations       |
| 🧪 POM            | Page Object Model             |
| 🖥️ IDE            | Eclipse / IntelliJ            |

---

## 📁 Project Structure

```yaml
📁 src
 ┣ 📁 main
 ┃ ┗ 📁 java
 ┃   ┣ 📁 base                # WebDriver setup and BaseTest
 ┃   ┣ 📁 utils               # Utilities like waits, browser init, readers
 ┃   ┣ 📁 pages               # Page Object Model (POM) classes
 ┃   ┗ 📁 config              # .properties file readers and managers
 ┣ 📁 test
 ┃ ┗ 📁 java
 ┃   ┗ 📁 testcases           # TestNG test scripts
┣ 📁 resources
 ┃ ┣ 📄 config.properties     # Global configuration values
 ┃ ┗ 📄 testdata.properties   # Test-specific dynamic data
┣ 📄 pom.xml                  # Maven project file
┣ 📄 testng.xml               # TestNG suite configuration


---

## ✨ Features

✅ TestNG-based Hybrid framework  
✅ `.properties` file handling for flexible config/data  
✅ Page Object Model (POM) design pattern  
✅ Modular and Utility-Driven Codebase  
✅ Cross-browser support ready  
✅ Scalable for Playwright and Python integration  

---

## 🚀 How to Run the Tests

1. 🔁 Clone the repository  
```bash

git clone https://github.com/yourusername/tutorials-ninja-selenium-framework.git

# 🧪 Task 1 — Dynamic Browser Launch using `.properties` File

📌 **Goal:**  
To retrieve data from a `.properties` file and use it to launch different browsers dynamically (e.g., Chrome, Firefox, Edge) as per the configuration — a core step in building a flexible automation framework.

---

## 📋 Task Summary

| 🔢 Step | 🛠️ Action | 📄 Description |
|--------|-----------|----------------|
| 1️⃣ | **Create `config.properties`** | Store keys like `browser`, `url`, etc., to externalize test setup. |
| 2️⃣ | **Build `PropertyReader` Utility** | Java class to fetch values from the properties file using `java.util.Properties`. |
| 3️⃣ | **Modify BaseTest / DriverFactory** | Use the `browser` value from the properties file to launch Chrome, Firefox, etc. |
| 4️⃣ | **Run TestNG Test** | Execute test and verify if the correct browser launches with the given URL. |

---

## 🗂️ Sample `config.properties`

```properties
browser=chrome
url=https://tutorialsninja.com/demo
