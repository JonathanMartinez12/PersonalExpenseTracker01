package com.expensetracker;
public class ExpenseTrackerApp {
    public static void main(String[] args) {
        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.addExpense(new Expense(50.0, "Food", "2024-12-28"));
        expenseManager.addExpense(new Expense(20.0, "Transport", "2024-12-27"));

        expenseManager.displayExpenses();

    }

}


