package com.mavenProject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        CalculatorUI calculatorUI = new CalculatorUI();
        Scene scene = new Scene(calculatorUI.createContent(), 300, 250);

        primaryStage.setTitle("Simple JavaFX Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
