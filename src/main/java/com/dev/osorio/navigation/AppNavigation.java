package com.dev.osorio.navigation;

import com.dev.osorio.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppNavigation {

    private static BorderPane borderPane;
    private static final Map<String, Parent> views = new HashMap<>();

    public static Parent initialize(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
        borderPane = loader.load();

        return borderPane;
    }

    public static void loadViews(String name, String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
        Parent root = loader.load();

        views.put(name, root);
    }

    public static void navigateTo(String fxml) {
        borderPane.setCenter(views.get(fxml));
    }
}
