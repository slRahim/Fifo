package com.desktop;

import com.desktop.stage.HomeScreen;
import com.desktop.util.HibernateUtil;
import javafx.application.Application;

public class App  {

    public static void main(String[] args) {
        Application.launch(HomeScreen.class , args);
    }

//    public static void main(String[] args) {
//        HibernateUtil.getSessionFactory();
//    }

}