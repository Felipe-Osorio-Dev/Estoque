package com.dev.osorio.util;

public enum Views {

    MAIN_PANE("mainPane", "views/MainPane.fxml"),
    REGISTER("register", "views/RegisterProduct.fxml"),
    PRODUCT("product", "views/Product.fxml"),
    DETAILS("details",  "views/ProductDetails.fxml"),;

    private final String viewName;
    private final String fxml;

    Views(String viewName, String fxml){
        this.viewName = viewName;
        this.fxml = fxml;
    }
    public String getViewName() {
        return viewName;
    }

    public String getFxml() {
        return fxml;
    }
}
