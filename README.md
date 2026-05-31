# Target Grade Forecaster (SCD Semester Project)

## 📌 Project Overview
This is a Desktop Application created in Java (using Swing). It helps students calculate how many marks they need in their Final Exams to get their desired target grade (like A, B+, C). It takes internal marks (Mids, Quizzes, Assignments, CP) and their weightages to make accurate calculations.

## ✅ Fulfilled Requirements
This project fully implements the 5 mandatory requirements given by the instructor:

1. **Event Handling:** - A functional GUI using Java Swing (`JFrame`, `JTextField`, `JButton`). 
   - Uses `ActionListener` to perform calculations instantly when the "Calculate Required Marks" button is clicked.
2. **Exception Handling:** - Try-Catch blocks are used to catch `NumberFormatException` if a user types alphabets instead of numbers or leaves boxes empty.
   - Throws `IllegalArgumentException` for logic errors (e.g., if obtained marks are greater than total marks, or if the total weightage is not exactly 100%).
3. **Code Refactoring (Modular Design):** - Clean coding practices are applied. The GUI and Math logic are completely separated. 
   - All formulas and validation checks are kept in a separate file named `GradeLogic.java`.
4. **Unit Testing:** - Automated test cases are written using JUnit 4.
   - The file `GradeLogicTest.java` tests correct calculations, wrong weightages, and negative test cases successfully.
5. **Git & GitHub:** - Project is version-controlled using Git and pushed to this GitHub repository.
   - Meaningful commit messages and a properly formatted `README.md` file are included.

## ⚙️ How to Run the Project
1. Download or clone this repository to your computer.
2. Open your Eclipse IDE and create a new Java Project.
3. Paste all `.java` files from the `src` folder into your new project's `src` folder.
4. Add the **JUnit 4** library to your project's Build Path.
5. Run the `GradeCalculatorGUI.java` file to open the application window.
6. Run the `GradeLogicTest.java` file to see the automated test cases pass (Green Bar).

## 📸 Application Screenshot



