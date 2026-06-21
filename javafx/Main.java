package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button =new Button("Submit");
        BorderPane root=new BorderPane(button);
        Scene scene=new Scene(root, Color.BLACK);
        scene.setCursor(Cursor.CLOSED_HAND);

        stage.setScene(scene);
        stage.show();
        stage.setTitle("THis is my work");
        stage.setWidth(500);
        stage.setHeight(400);
    }
}
