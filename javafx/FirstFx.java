package com.example.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FirstFx extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button=new Button("Click me!");
        StackPane stackPane =new StackPane(button);
        Scene scene=new Scene(stackPane, 600,400);
        stage.setScene(scene);
        stage.show();

        //implementing the action events
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("This is my first javafx program!");
            }
        });

    }
}