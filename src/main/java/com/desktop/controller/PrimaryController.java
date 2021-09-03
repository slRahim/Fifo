package com.desktop.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.desktop.entity.User;
import com.desktop.repository.DaoFactory;
import com.desktop.repository.UserDao;
import com.desktop.stage.HomeScreen;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PrimaryController implements Initializable {
    private DaoFactory daoFactory ;
    private UserDao userDao;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        daoFactory= DaoFactory.getInstance();
        this.userDao=daoFactory.getUserDao();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        System.out.println("click");
//        HomeScreen.setRoot("secondary");
//
//        User user01 = new User();
//        user01.setId(5);
//        user01.setNom("rahim");
//        user01.setUsername("pou77");
//        user01.setPassword("1234");
//        user01.setType("caissie");

//        userDao.getUser(user01);
//        daoFactory.addItem(user01);
//        userDao.getAll(null, null);
//        daoFactory.updateItem(user01);
//        daoFactory.dellItem(user01);





    }
}
