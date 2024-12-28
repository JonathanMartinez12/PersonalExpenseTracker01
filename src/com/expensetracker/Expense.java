package com.expensetracker;
public class Expense {
    private double amount_of_money;
    private String category_of_expense;
    private String date;

public Expense(double amount_of_money, String category_of_expense, String date) {
    this.amount_of_money = amount_of_money;
    this.category_of_expense = category_of_expense;
    this.date = date;
}
public double getAmount_of_money() {
    return amount_of_money;
}
public void setAmount_of_money(double amount_of_money) {
    this.amount_of_money = amount_of_money;
}
public String getCategory_of_expense() {
    return category_of_expense;
}
public void setCategory_of_expense(String category_of_expense) {
    this.category_of_expense = category_of_expense;
}
public String getDate() {
    return date;
}
public void setDate(String date) {
    this.date = date;
}
@Override
    public String toString() {
        return "Expense--->" + "amount_of_money=" + amount_of_money + ", category_of_expense=" + category_of_expense + ", date=" + date + '}';
    }
}
