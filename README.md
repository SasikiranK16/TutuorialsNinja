# 🧠💻 NinjaTestX – Selenium Hybrid Automation Framework

> 🚀 *Tutorials Ninja - Self-Upskilling Automation Project*

---

## 🔥 Overview

**NinjaTestX** is a modern and scalable hybrid test automation framework developed as part of my **personal upskilling journey**.  
It leverages Java, Selenium, TestNG, and the Page Object Model (POM), with dynamic `.properties`-based configuration and utility-driven design.

---

## 🎯 Project Objective

The main goal of this project is to:
- ✅ Build a maintainable, flexible, and scalable automation framework
- ✅ Use `.properties` for dynamic config
- ✅ Create reusable utilities for browser & UI operations
- ✅ Prepare for future migration to **Python** & **Playwright**

---

## 🛠️ Tech Stack & Tools

| 🛠️ Tool/Tech       | 📌 Description                           |
|--------------------|-------------------------------------------|
| ☕ Java             | Programming Language                      |
| 🌐 Selenium         | Browser Automation                        |
| ⚙️ TestNG           | Testing Framework                         |
| 📦 Maven            | Build & Dependency Management             |
| 🗂️ .properties      | External Configuration                    |
| 🧪 POM              | Page Object Model Design Pattern          |
| 🖥️ Eclipse / IntelliJ | IDE for Development                     |

---

## 🧪 Phase 1 – Dynamic Browser Launch Setup

This is the first phase of the framework focusing on dynamic browser and URL launching using `.properties` files.

### 📋 Step-by-Step Setup

| 🔢 Step | 🔍 Action                          | 📄 Description                                                                 |
|--------|------------------------------------|-------------------------------------------------------------------------------|
| 1️⃣     | Create `config.properties`         | Define keys like `browser=chrome`, `url=https://...`                         |
| 2️⃣     | Build Property Reader Utility      | Utility class to fetch properties dynamically                                |
| 3️⃣     | Setup Driver Factory / BaseTest    | Launch browser & open the configured URL                                     |
| 4️⃣     | Write Reusable Utility Methods     | Waits, Screenshots, Actions, Validations                                     |
| 5️⃣     | Execute TestNG Test Suite          | Validate full flow via `testng.xml`                                          |

---

## 🗂️ Sample `config.properties`

```properties
browser=chrome
url=https://tutorialsninja.com/demo

---

public void optBrowserAndUrl(String browserName, String urlLink, String propFileName)
| 🧩 Parameter   | 📝 Description                                                                   |
| -------------- | -------------------------------------------------------------------------------- |
| `browserName`  | Name of the browser to launch (e.g., `chrome`, `firefox`, `edge`)                |
| `urlLink`      | The target URL to navigate after browser launch                                  |
| `propFileName` | The name of the `.properties` file containing config (e.g., `config.properties`) |
