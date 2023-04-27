package com.zapping.zappingtochannel;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

import java.io.IOException;

public class ZappingToChannelApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ZappingToChannelApp.class.getResource("channel_picker.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Channel Picker!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}