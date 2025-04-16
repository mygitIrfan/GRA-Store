# 🛡️ GRA Store – Fantasy Game Store System

**A mini Java project simulating a fantasy-themed in-game store.**

---

## 📌 Project Overview

GRA Store is a GUI-based Java application built using the Swing framework. It allows users to interact with an RPG-style inventory system that includes weapons, potions, armor, and tools. The application reads item data from text files, processes it with object-oriented logic, and displays it in a user-friendly interface.

---

## 🧩 Features

- 🧙 Weapon, armor, potion, and tool item categories  
- 💾 File-based item storage (e.g., `SwordData.txt`)  
- 🖼️ GUI interaction via Java Swing  
- 🧠 Object-oriented design with inheritance and polymorphism  
- 📦 Modular package structure for item types

---

## 🛠️ Technologies Used

- Java 8+  
- Swing (Java GUI)  
- File I/O  
- OOP (Encapsulation, Inheritance, Polymorphism)  
- Maven (via `pom.xml`)

---

## 🗂️ Project Structure

```bash
src/
└── main/java/
    └── my/edu/unikl/
        ├── codex/           # Item categories (weapon, armor, potion, tool)
        ├── FileHandling/    # File I/O operations
        ├── Menu/            # Main application logic
        └── test/            # GUI class (FrameGUIStore.java)
SwordData.txt                # Example item data file
pom.xml                      # Maven project config
