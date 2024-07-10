package de.brandenburg.th.se.pizzeria.application.jfx;

import de.brandenburg.th.se.pizzeria.domain.speisekarte.Speise;
import de.brandenburg.th.se.pizzeria.domain.speisekarte.Speisekarte;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainJFXView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Speisekarte speisekarte = new Speisekarte("Testkarte");
        speisekarte.addSpeise(new Speise("Margarita", 5.99F));
        speisekarte.addSpeise(new Speise("Salami", 7.99F));
        speisekarte.addSpeise(new Speise("Tiramisu", 4.50F));
        speisekarte.addSpeise(new Speise("Spaghetti", 8.50F));
        FXMLLoader loader = new FXMLLoader(
                MainJFXView.class.getResource("/pizzeria.fxml")
        );
        AnchorPane page = loader.load();
        VBox speiseLabelsContainer = (VBox) page.lookup("#speiseLabelsContainer");
        for (Speise speise : speisekarte.getSpeisen()) {
            Label speiseLabel = new Label(speise.getName() + ": " + speise.getPreis() + " €");
            speiseLabelsContainer.getChildren().add(speiseLabel);
        }

        Scene scene = new Scene(page);
        primaryStage.setTitle("Pizzeria");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
