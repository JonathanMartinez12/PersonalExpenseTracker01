package com.expensetracker;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;
    public ExpenseManager(){
        expenses = new ArrayList<>();
    }
 public void addExpense(Expense expense){
        expenses.add(expense);

 }
public void displayExpenses(){
        for(int i = 0; i < expenses.size(); i++){
            System.out.println(expenses.get(i));
        }

}
}
