package com.tienda.lemas;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    String usuario = "admin";
    String contrasena = "12345";

    @FXML
    private Button btnIngresar;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private TextField txtUsuario;

    @FXML
    void ingresar(ActionEvent event) throws IOException {

        String user = txtUsuario.getText();
        String pass = txtContrasena.getText();
        if(user.equalsIgnoreCase("")){
            Alert alert = new Alert(AlertType.INFORMATION, "Es requerido el usuario");
            alert.showAndWait();
            return;
        }
        if(pass.equalsIgnoreCase("")){
            Alert alert = new Alert(AlertType.INFORMATION, "Es requerido la contraseña");
            alert.showAndWait();
            return;
        }

        if(user.equalsIgnoreCase(usuario) && pass.equalsIgnoreCase(contrasena)){
            App.setRoot("inventario");
        } else {
            Alert alertaError = new Alert(AlertType.ERROR, "Credendiciales invalidas");
            alertaError.showAndWait();
        }
    }

}
