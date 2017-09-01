package TemperatureMonitorPackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This class starts the temperature monitor
 */
public class TemperatureMonitor extends Application {
    /**
     * Starts the interface
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getResource("window.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Temperature Sensor Monitor");
            primaryStage.setScene(scene);
            primaryStage.getIcons().add(new Image(TemperatureMonitor.class.getResourceAsStream("thermometer.jpg")));
            primaryStage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

