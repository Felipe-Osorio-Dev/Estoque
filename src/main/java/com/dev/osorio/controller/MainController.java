package com.dev.osorio.controller;

import com.dev.osorio.navigation.AppNavigation;
import com.dev.osorio.util.Views;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void navigateToRegister() {AppNavigation.navigateTo(Views.REGISTER.getViewName());}

    @FXML
    private void navigateToProduct() {
        AppNavigation.navigateTo(Views.PRODUCT.getViewName());
    }
}
