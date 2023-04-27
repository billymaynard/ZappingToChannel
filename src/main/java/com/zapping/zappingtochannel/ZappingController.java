package com.zapping.zappingtochannel;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ZappingController implements Initializable {
    @FXML
    private Label Awnser;
    @FXML
    private Spinner CurrentSpinner;
    @FXML
    private Spinner DesiredSpinner;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> CurrentSpinnerFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99);
        SpinnerValueFactory<Integer> DesiredSpinnerFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99);
        this.CurrentSpinner.setValueFactory(CurrentSpinnerFactory);
        this.DesiredSpinner.setValueFactory(DesiredSpinnerFactory);
    }
    @FXML
    public void calculate(){
        Channels setofchannels = new Channels(99);
        Direction direction = setofchannels.closestto((Integer) CurrentSpinner.getValue(), (Integer) DesiredSpinner.getValue());
        Awnser.setText(direction.getDirection()+" by "+direction.clicks+" to reach your channel");
        SpinnerValueFactory<Integer> CurrentSpinnerFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,99, (Integer) DesiredSpinner.getValue());
        CurrentSpinner.setValueFactory(CurrentSpinnerFactory);
    }
}