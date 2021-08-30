package com.desktop.controller;

import java.io.IOException;

import com.desktop.stage.HomeScreen;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        HomeScreen.setRoot("primary");
    }
}