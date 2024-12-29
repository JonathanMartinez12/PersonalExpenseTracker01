package com.expensetracker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExpenseTrackerUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Layout setup
        VBox root = new VBox(10); // Vertical layout with 10px spacing
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // UI Components
        Label titleLabel = new Label("Personal Expense Tracker");
        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount");
        TextField categoryField = new TextField();
        categoryField.setPromptText("Enter category");
        TextField dateField = new TextField();
        dateField.setPromptText("Enter date (YYYY-MM-DD)");

        Button addButton = new Button("Add Expense");
        Button displayButton = new Button("Display Expenses");

        // Button Actions
        addButton.setOnAction(e -> {
            String amount = amountField.getText();
            String category = categoryField.getText();
            String date = dateField.getText();

            // Add logic for adding an expense (call a method from ExpenseTrackerMain)
            System.out.println("Expense Added: " + amount + ", " + category + ", " + date);

            // Clear fields after adding
            amountField.clear();
            categoryField.clear();
            dateField.clear();
        });

        displayButton.setOnAction(e -> {
            // Logic for displaying expenses (can integrate with ExpenseTrackerMain)
            System.out.println("Displaying expenses...");
        });

        // Add components to layout
        root.getChildren().addAll(titleLabel, amountField, categoryField, dateField, addButton, displayButton);

        // Create Scene and Stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Expense Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}