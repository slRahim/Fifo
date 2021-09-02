package com.desktop.stage;

import com.desktop.repository.DaoFactory;
import com.desktop.util.Helpers;
import com.desktop.util.HibernateUtil;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeScreen extends Application {
    private static Scene scene;

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(Helpers.loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(Helpers.loadFXML(fxml));
    }
}
