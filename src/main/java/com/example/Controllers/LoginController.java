package com.example.Controllers;

import java.io.IOException;

import com.example.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController{

    @FXML
    private CheckBox check;

    @FXML
    private PasswordField hiddenpassword;

    @FXML
    private TextField user;

    @FXML
    private TextField showpassword;
    @FXML
    private Button cancelButton;

    public void afficherPassword(ActionEvent e) {
        // String input1=hiddenpassword.getText();
        // String input2=showpassword.getText();
        // String promptTextInitial="Password";
        // if (check.isSelected()) {
        //     hiddenpassword.setPromptText("");
        //     if(hiddenpassword.getText().isEmpty()){
        //         hiddenpassword.setPromptText(promptTextInitial);
        //     }
        // }

    }
    public void setCancelButton(ActionEvent e){
        Stage stage=(Stage)cancelButton.getScene().getWindow();
        stage.close();
    }
    public void test(){
        System.out.println("HELLO");
    }
    public void switchScene(ActionEvent e) throws IOException{
        Main.mainApp.switchScene("view","Dashboard");
    }
}
