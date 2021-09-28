package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage window){
        window.setHeight(300);
        window.setWidth(500);
        window.setTitle("Inholland JavaFX Password Validation");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Text txtWelcome = new Text("Welcome");
        txtWelcome.setFont(Font.font("Arial", FontWeight.LIGHT, 20));

        //Labels and TextFields
        Label lblUsername = new Label("Username: ");

        TextField txtUsername = new TextField();
        txtUsername.setPromptText("username");

        Label lblPassword = new Label("Password: ");

        PasswordField txtPassword = new PasswordField();
        txtPassword.setPromptText("password");

        Button signInButton = new Button("Sign In");

        //Nodes in grid
        gridPane.add(txtWelcome, 0,0);
        gridPane.add(lblUsername,0,1);
        gridPane.add(txtUsername,1,1);
        gridPane.add(lblPassword,0,2);
        gridPane.add(txtPassword,1,2);
        gridPane.add(signInButton,1,3);

        //Scene
        Scene scene = new Scene(gridPane);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
