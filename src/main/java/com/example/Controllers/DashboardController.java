package com.example.Controllers;

import java.io.IOException;

import com.example.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DashboardController {

    @FXML
    private Button disconnectButton;

    public void switchScene(ActionEvent e) throws IOException{
        Main.mainApp.switchScene("login","login");
    }
}
