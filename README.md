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


# 🚀 Selenium Automation Utilities - Task 2 & Task 3

Welcome to the automation utilities section of our hybrid Selenium TestNG framework! 🎯  
Below are the key utility methods implemented to boost browser handling and dynamic web interaction efficiency.

---

## 📌 Task 2: Dynamic Browser & URL Launcher

| 🔧 Method Name | `optBrowserAndUrl(String browserName, String urlLink, String propFileName)` |
|---------------|-----------------------------------------------------------------------------|
| 📋 **Purpose** | Launches a browser dynamically based on input and opens a URL.             |
| 🧩 **Parameters** | 1. `browserName` – Browser to launch (e.g., `"chrome"`, `"firefox"`). <br>2. `urlLink` – URL to open. <br>3. `propFileName` – Properties file to retrieve any required settings. |
| 🔄 **Core Logic** | Reads properties, sets browser options, and launches the site dynamically. |
| 💎 **Highlights** | ✨ Configurable 🔄 Reusable ♻️ Lightweight |

---

## 📌 Task 3: Navbar Interaction Methods

### 🔹 Method: `clickSpecificElementOfNavbarElements(String elementName)`

| 📋 **Purpose** | Clicks directly on any top-level navigation bar element. |
|---------------|-----------------------------------------------------------|
| 🧩 **Parameter** | `elementName` – Text of the navbar element to click (e.g., `"Login"`, `"Register"`). |
| 🎯 **Usage** | Used for clicking static elements without drop-downs. |
| 🛠️ **Use Case** | Clicking `Contact Us`, `Home`, `About`, etc., in the navbar. |
| 💎 **Highlights** | 🔍 Accurate Click 🎯 Fast Interaction ✅ Clean DOM access |

---

### 🔸 Method: `clickSpecificElementOfDropDownOfMyAccount(String NavBarElementName, String innerDropDownElement)`

| 📋 **Purpose** | Handles dropdowns within navbar (like "My Account" > "Register"). |
|---------------|--------------------------------------------------------------------|
| 🧩 **Parameters** | 1. `NavBarElementName` – Main navbar item (e.g., `"My Account"`). <br>2. `innerDropDownElement` – Dropdown sub-item (e.g., `"Login"` or `"Register"`). |
| 🎯 **Usage** | Clicks elements nested under dropdown structures. |
| 💡 **Scenario** | For dynamic drop-downs where direct click fails due to hidden elements. |
| 💎 **Highlights** | 🧠 Intelligent Navigation 💥 Custom Logic 🎯 Reliable Interaction |

---

## 🛠️ Framework Highlights

- 🧩 **Modular Methods** – Each function performs a distinct task for easier debugging & reusability.
- 🔐 **Properties-Driven** – All configurations are handled via `.properties` files.
- 🌐 **Cross-Browser Support** – Works with Chrome, Firefox, Edge, and more.
- 📄 **TestNG Powered** – Well-integrated with TestNG for flexible test execution.

---
