package com.example.Controllers;

import java.io.IOException;

import com.example.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController{

    @FXML
    private Button cancelButton;

    @FXML
    private ImageView close_eye;

    @FXML
    private PasswordField hiddenpassword;
    @FXML
    private ImageView open_eye;
    @FXML
    private TextField showpassword;
    @FXML
    private TextField user;
    String password;
    @FXML
    void initialize(){
        showpassword.setVisible(false);
        open_eye.setVisible(false);

    }
    @FXML
    void HiddenPassword(KeyEvent keyEvent) {
        password=hiddenpassword.getText();
        showpassword.setText(password);

    }
    @FXML
    void showPassword(KeyEvent keyEvent) {
        password=showpassword.getText();
        hiddenpassword.setText(password);


    }
    @FXML
    void closeEye(MouseEvent mouseEvent) {
        showpassword.setVisible(true);
        open_eye.setVisible(true);
        hiddenpassword.setVisible(false);
        close_eye.setVisible(false);

    }

    @FXML
    void openEye(MouseEvent mouseEvent) {
        hiddenpassword.setVisible(true);
        close_eye.setVisible(true);
        open_eye.setVisible(false);
        showpassword.setVisible(false);

    }

    @FXML
    void setCancelButton(ActionEvent actionEvent) {
        Stage stage=(Stage)cancelButton.getScene().getWindow();
        stage.close();

    }

}
