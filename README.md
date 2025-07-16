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



| 🔢 Step | 🛠️ Action                     | 📄 Description                                               |
|--------|-------------------------------|-------------------------------------------------------------|
| 1️⃣     | Create `config.properties`     | Define keys like `browser=chrome` and test `url=https://...` |
| 2️⃣     | Build Property Reader Utility  | Read the key-value pairs during runtime                      |
| 3️⃣     | Driver Setup Based on Property | Launch appropriate WebDriver based on config                 |
| 4️⃣     | Execute TestNG Suite           | Validate browser launch and URL navigation                   |

### 🧪 Task 1 — Dynamic Browser Launch via `.properties` File

📌 **Objective:**  
Kickstarting the framework with a strong foundation by **retrieving config values from `.properties` files** and **launching browsers dynamically** based on those values. This includes building **custom utility methods** to support scalable automation tasks.

---

## 📋 Task Overview

| 🔢 Step | 🛠️ Action                         | 📄 Description                                                                 |
|--------|-----------------------------------|-------------------------------------------------------------------------------|
| 1️⃣     | Create `config.properties`        | Define key-value pairs like `browser=chrome`, `url=https://...`              |
| 2️⃣     | Build Property Reader Utility     | Java utility class to fetch property values dynamically                      |
| 3️⃣     | Setup Driver Factory / BaseTest   | Launch browser based on `browser` property and open the specified `url`      |
| 4️⃣     | Write Custom Utility Methods      | Design reusable methods for waits, interactions, screenshots, validations... |
| 5️⃣     | Execute TestNG Test Suite         | Validate the setup by running the test on the selected browser               |

---

## 🔑 Example `config.properties`

```properties
browser=chrome
url=https://tutorialsninja.com/demo
