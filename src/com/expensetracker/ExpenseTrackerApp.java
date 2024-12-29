package com.expensetracker;
import java.util.Scanner;


public class ExpenseTrackerApp{
    public static void main(String[] args) {
        ExpenseManager expenseManager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Welcome to the Personal Expense Tracker----- ");
        while (true) {
            System.out.println("Enter an expense or press q to quit:");
            System.out.println();
            System.out.println("Enter amount of money:");
            String amountInput = scanner.nextLine();
            double amountOfMoney;

            // Validate amount input
            try {
                amountOfMoney = Double.parseDouble(amountInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount entered. Please enter a valid number.");
                continue;
            }

            System.out.println("Enter the category of the expense:");
            String categoryOfExpense = scanner.nextLine();

            System.out.println("Enter the date of the expense (YYYY-MM-DD):");
            String dateInput = scanner.nextLine();

            // Validate date format
            try {
                java.time.LocalDate.parse(dateInput); // Throws exception if format is wrong
            } catch (java.time.format.DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
                continue;
            }

            // Create and add expense
            Expense expense = new Expense(amountOfMoney, categoryOfExpense, dateInput);
            expenseManager.addExpense(expense);
            expenseManager.displayExpenses();

            // Ask user if they want to add another expense
            System.out.println("Would you like to add another expense? Enter y or n:");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Save to file when exiting
        System.out.println("Would you like to save your expenses to a file? Enter y or n:");
        String saveChoice = scanner.nextLine();
        if (saveChoice.equalsIgnoreCase("y")) {
            System.out.println("Enter the filename to save your expenses (e.g., expenses.txt):");
            String fileName = scanner.nextLine();

            expenseManager.saveExpensesToFile(fileName); // Call file-saving method
        }

        scanner.close();
        System.out.println("Application has exited.");
    }
}


