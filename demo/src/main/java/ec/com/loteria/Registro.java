package ec.com.loteria;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Registro implements Initializable {

    @FXML
    private Button btnGuardar;

    @FXML
    private CheckBox chkTerminosCondiciones;

    @FXML
    private ComboBox<String> cmbCiudad;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        cargarCiudades();
    }
    
    private void cargarCiudades() {
        cmbCiudad.getItems().clear();
        List<String> lstCiudades = new ArrayList<>();
        lstCiudades.add("Guayaquil");
        lstCiudades.add("Quito");
        lstCiudades.add("Cuenca");
        cmbCiudad.setItems(FXCollections.observableArrayList(lstCiudades));
    }

    @FXML
    void guardarCliente(ActionEvent event) {
        if(txtEdad.getText().equalsIgnoreCase("")){
            Alert alert = new Alert(AlertType.INFORMATION, "Es requerido la edad de la persona");
            alert.showAndWait();
            return;
        }
        String auxEdad = (txtEdad.getText().equalsIgnoreCase("")) ? "0" : txtEdad.getText(); //Operador Ternario
        int edad = Integer.valueOf(auxEdad);
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        if( edad < 18){
            Alert alert = new Alert(AlertType.INFORMATION, "Es menor de edad no puede ser registrado");
            alert.showAndWait();
        }
        if(!chkTerminosCondiciones.isSelected()){
            Alert alert = new Alert(AlertType.CONFIRMATION, "Es obligación dar click en esta opción de terminos y condiciones");
            alert.showAndWait();
        }
        if(nombre != null && nombre.length() <1){
            Alert alert = new Alert(AlertType.INFORMATION, "Es requerido el ingreso de un nombre");
            alert.showAndWait();
        }
        if(apellido != null && apellido.length() <1){
            Alert alert = new Alert(AlertType.INFORMATION, "Es requerido el ingreso de un apellido");
            alert.showAndWait();
        }
    }
}
