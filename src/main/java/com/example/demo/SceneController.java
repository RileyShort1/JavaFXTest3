package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToDefineNewCategoryPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DefineNewCategoryPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHomePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}