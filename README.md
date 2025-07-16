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


---
## 🚀 Selenium Automation Utilities – Task 2 & Task 3

Welcome to the automation utilities module of our advanced Selenium Hybrid Framework!  
This section demonstrates two powerful browser and UI interaction methods that make our framework dynamic, scalable, and reusable. 💻✨

---

### 📌 Task 2: Dynamic Browser and URL Launcher

### 🔧 Method Signature
```java
optBrowserAndUrl(String browserName, String urlLink, String propFileName)

---
| 🔑 Attribute      | 💡 Description                                                        |
| ----------------- | --------------------------------------------------------------------- |
| 📋 **Purpose**    | Clicks any top-level static element in the website's navigation bar.  |
| 🧩 **Parameter**  | `elementName` – The visible text of the navbar item (e.g., `"Login"`) |
| 💼 **Use Case**   | Used when clicking items like `Home`, `Contact`, `About Us`, etc.     |
| 💎 **Highlights** | ✅ Simplified Access<br>🎯 DOM Consistency<br>📚 Easy to Maintain      |

---
```java
 clickSpecificElementOfDropDownOfMyAccount(String NavBarElementName, String innerDropDownElement)


| 🔑 Attribute      | 💡 Description                                                                                                                        |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| 📋 **Purpose**    | Clicks nested elements within a dropdown under a navbar element.                                                                      |
| 🧩 **Parameters** | `NavBarElementName` – Parent menu item (e.g., `"My Account"`) <br>`innerDropDownElement` – Child dropdown option (e.g., `"Register"`) |
| 💼 **Use Case**   | Useful when dropdown menus need two-level interaction handling.                                                                       |
| 💎 **Highlights** | 🧠 Smart Dropdown Handling<br>💥 Dynamic Locators<br>✅ Robust Navigation                                                              |

---
