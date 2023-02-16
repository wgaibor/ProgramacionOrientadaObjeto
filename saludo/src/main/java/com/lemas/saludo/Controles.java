package com.lemas.saludo;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;

public class Controles implements Initializable {

    @FXML
    private ComboBox<String> cmbListado;

    @FXML
    private Button btnMostrarDialogo;
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        cmbListado.getItems().clear();
        List<String> strings = new ArrayList<>();
        strings.add("Test1");
        strings.add("Test2");
        cmbListado.setItems(FXCollections.observableArrayList(strings));
    }

    @FXML
    void mostrarDialogo(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Delete " + cmbListado.getValue() + " ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

    }
}
