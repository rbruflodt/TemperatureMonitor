package TemperatureMonitorPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Rachel on 8/31/2017.
 */
public class TemperatureMonitorController{

    @FXML
    private Button virtualButton;

    @FXML
    private LineChart tempChart;

    @FXML
    private NumberAxis xAxis ;

    @FXML
    private NumberAxis yAxis ;

    public void initialize()
    {
        xAxis.setLabel("Time (seconds ago)");
        yAxis.setLabel("Temperature °C");

        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(300);
        xAxis.setUpperBound(0);
        xAxis.setTickUnit(60);

        yAxis.setAutoRanging(false);
        yAxis.setLowerBound(10);
        yAxis.setUpperBound(50);
    }

    @FXML
    private void virtualButtonPressed(ActionEvent event){
        if(virtualButton.getText().equals("Button Off")) {
            virtualButton.setText("Button On");
            virtualButton.setStyle("-fx-background-color: green");
        }
        else{
            virtualButton.setText("Button Off");
            virtualButton.setStyle("-fx-background-color: black");
        }
    }
}
