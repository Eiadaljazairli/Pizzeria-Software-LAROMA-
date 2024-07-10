package de.brandenburg.th.se.pizzeria.application.jfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class JFXController {
    @FXML
    private Label labelUeberschrift;

    @FXML
    private Label labelKategorie;

    @FXML
    private VBox speiseLabelsContainer;

    @FXML
    void initialize() {
        labelUeberschrift.setText("Pizzeria Speisekarte");
    }

    @FXML
    private void showPizza() {
        labelKategorie.setText("Pizza hinzufügen");
    }

    @FXML
    private void showPasta() {
        labelKategorie.setText("Pasta hinzufügen");
    }

    @FXML
    private void showDessert() {
        labelKategorie.setText("Dessert hinzufügen");
    }
}
