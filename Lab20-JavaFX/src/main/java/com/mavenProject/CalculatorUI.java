package com.mavenProject;

import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class CalculatorUI {

    private TextField input1 = new TextField();
    private TextField input2 = new TextField();
    private Label resultLabel = new Label("Result: ");

    public Parent createContent() {
        Label label1 = new Label("Number 1:");
        Label label2 = new Label("Number 2:");
        Button addButton = new Button("Add");

        addButton.setOnAction(e -> {
            try {
                int a = Integer.parseInt(input1.getText());
                int b = Integer.parseInt(input2.getText());
                int result = CalculatorLogic.add(a, b);
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers!");
            }
        });

        VBox layout = new VBox(10);
        layout.setStyle("-fx-padding: 20;");
        layout.getChildren().addAll(label1, input1, label2, input2, addButton, resultLabel);

        return layout;
    }
}
