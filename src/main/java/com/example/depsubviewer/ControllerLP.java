package com.example.depsubviewer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLP {
    Scene scene;
    Stage stage;
    @FXML
    public void click(ActionEvent event) throws IOException {
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("Design1.fxml"));
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }
}
