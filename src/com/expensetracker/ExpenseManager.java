package com.expensetracker;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<String> expenses;

    // Constructor to initialize the expenses list
    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    // Method to display expenses
    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
            return;
        }
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((i + 1) + ". " + expenses.get(i));
        }
    }

    // Method to remove an expense by index
    public void removeExpense(int index) {
        if (index >= 0 && index < expenses.size()) {
            expenses.remove(index);
            System.out.println("Expense removed successfully.");
        } else {
            System.out.println("Please choose a valid index.");
        }
    }

    // Method to save expenses to a file
    public void saveExpensesToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String expense : expenses) {
                writer.write(expense);
                writer.newLine(); // Write each expense on a new line
            }
            System.out.println("Expenses successfully saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving expenses to file: " + e.getMessage());
        }
    }

    // Method to add a new expense
    public void addExpense(Expense expense) {
        expenses.add(String.valueOf(expense));
    }
}