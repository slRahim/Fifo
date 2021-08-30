package com.desktop.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import com.desktop.App;

import java.io.IOException;

public class Helpers {

    public static Parent loadFXML(String fxml) throws IOException {
        fxml = "view/"+fxml ;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
