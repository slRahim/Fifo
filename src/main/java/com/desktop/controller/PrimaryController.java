package com.desktop.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.desktop.repository.DaoFactory;
import com.desktop.repository.UserDao;
import com.desktop.stage.HomeScreen;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PrimaryController implements Initializable {

    private UserDao userDao;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DaoFactory daoFactory= DaoFactory.getInstance();
        this.userDao=daoFactory.getUserDao();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("click");
        HomeScreen.setRoot("secondary");
//        userDao.getUser(1);
    }
}
