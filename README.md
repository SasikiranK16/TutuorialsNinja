# 🚀 Selenium Java Hybrid Automation Framework

🎯 **Project Name:** *Tutorials Ninja - Self-Upskilling Automation Project*  
💻 **Tech Stack:** Java + Selenium + TestNG + Maven + .properties Handling  
📁 **Framework Type:** Hybrid (Modular + Data-Driven + POM)

---

## 📌 Objective

This project is part of my **automation upskilling journey**, where I aim to build a clean, flexible, and scalable Selenium TestNG framework using `.properties` file support. Future expansions will include **Python** and **Playwright** frameworks.

---

## 🛠️ Tech Stack & Tools

| 🔧 Technology     | 💡 Purpose                         |
|------------------|------------------------------------|
| ☕ Java           | Programming Language               |
| 🌐 Selenium       | Browser Automation Library         |
| ⚙️ TestNG          | Testing Framework                  |
| 📦 Maven          | Build & Dependency Management      |
| 🗂️ .properties    | External Config/Data Management    |
| 🧪 POM            | Page Object Model Design Pattern   |
| 🖥️ IDE            | Eclipse / IntelliJ                 |

---

## 📁 Project Structure

```yaml
📁 src
 ┣ 📁 main
 ┃ ┗ 📁 java
 ┃   ┣ 📁 base                # WebDriver setup and BaseTest
 ┃   ┣ 📁 utils               # Waits, readers, driver utilities
 ┃   ┣ 📁 pages               # POM Classes
 ┃   ┗ 📁 config              # Properties file manager
 ┣ 📁 test
 ┃ ┗ 📁 java
 ┃   ┗ 📁 testcases           # TestNG test classes
📁 resources
 ┣ 📄 config.properties        # Global test settings
 ┗ 📄 testdata.properties      # Test-specific dynamic data
📄 pom.xml                     # Maven build config
📄 testng.xml                  # TestNG suite file


| 🔢 Step | 🛠️ Action                     | 📄 Description                                               |
| ------- | ------------------------------ | ------------------------------------------------------------ |
| 1️⃣     | Create `config.properties`     | Define keys like `browser=chrome` and test `url=https://...` |
| 2️⃣     | Build Property Reader Utility  | Read the key-value pairs during runtime                      |
| 3️⃣     | Driver Setup Based on Property | Launch appropriate WebDriver based on config                 |
| 4️⃣     | Execute TestNG Suite           | Validate browser launch and URL navigation                   |



browser=chrome
url=https://tutorialsninja.com/demo
