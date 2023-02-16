package com.lemas.saludo;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Saludo {

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnNuevaActividad;

    @FXML
    private Button btnSaludar;

    @FXML
    private TextField txtNombre;

    @FXML
    private Label txtSaludo;

    @FXML
    void clickEnElBoton(ActionEvent event) {
        String texto = txtNombre.getText();
        txtSaludo.setText("Hola buenas noches "+texto);
    }

    @FXML
    void clickSiguiente(ActionEvent event) throws IOException {
        App.setRoot("primary");
    }

    @FXML
    void limpiarTexto(ActionEvent event) {
        txtSaludo.setText("");
    }
}
