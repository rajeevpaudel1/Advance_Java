package com.example.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class rangeen extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button=new Button("Hello World!");
        StackPane stackPane=new StackPane(button);
        Scene scene=new Scene(stackPane,500,600);
        stage.setScene(scene);
        stage.show();

        //setting the action event
        button.


    }
}