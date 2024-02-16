package com.test.test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        Scene scene = new Scene(fxmlLoader.load(), 1000, 1000);
        final FileChooser fileChooser = new FileChooser();
        configuringFileChooser(fileChooser);

        Button button = new Button("Open dialog");


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();



        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                fileChooser.showOpenDialog(stage);
            }
        });


    }



    private void configuringFileChooser(FileChooser fileChooser) {

        fileChooser.setTitle("Select Pictures");
    }






    public static void main(String[] args) {
        launch();
    }
}