Personal Expense Tracker

The Personal Expense Tracker is a Java-based desktop application designed to help users manage their expenses effectively. It provides features for adding, viewing, and saving expense records, making it an ideal tool for tracking personal finances.

This project was developed using Java and JavaFX for the graphical user interface (GUI) and demonstrates core programming concepts such as object-oriented design, file handling, and event-driven programming.

Features:

Core Functionality

Add Expenses: Record expenses with details like amount, category, and date.

View Expenses: Display all recorded expenses in a list.

Save to File: Persist expense records to a file for long-term storage.

Load from File: Load saved expenses when the application starts.

Future Enhancements

Search and filter expenses by category or date.

Display summary statistics (e.g., total expenses, categorized totals).

Add visual effects (e.g., shadows and animations) for an enhanced user experience.

Integrate with a database for more robust data management.
How to Run

Prerequisites

Java Development Kit (JDK): Ensure you have JDK 8 or higher installed.

Apache NetBeans or IntelliJ IDEA: Use an IDE to open and run the project.

Steps to Run

Clone the repository:

git clone https://github.com/JonathanMartinez12/personal-expense-tracker.git

Open the project in your IDE.

Build and run the Main class located in the com.expensetracker package.

Project Structure:
src/
  com/expensetracker/
    Main.java        // Entry point for the application
    Expense.java     // Model class for expense records
    ExpenseManager.java // Controller class for managing expenses
    FileSaver.java   // Utility class for file operations
