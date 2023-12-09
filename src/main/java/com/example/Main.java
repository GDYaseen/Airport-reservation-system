package com.example;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends javafx.application.Application {

    private Stage primaryStage;
    public static Main mainApp;
    @Override
    public void start(Stage stage) throws IOException {
        mainApp=this;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        primaryStage=stage;
        //stage.setTitle("Union Airlines");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }

    public void switchScene(String pageFXML,String title) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/"+pageFXML+".fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) primaryStage.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle(title);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
}