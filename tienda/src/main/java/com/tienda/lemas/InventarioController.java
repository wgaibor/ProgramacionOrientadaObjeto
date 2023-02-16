package com.tienda.lemas;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventarioController {

    @FXML
    private Button btnAgregar;

    @FXML
    private TableColumn<?, ?> tbcCantidad;

    @FXML
    private TableColumn<?, ?> tbcCodigo;

    @FXML
    private TableColumn<?, ?> tbcDescripcion;

    @FXML
    private TableView<InventarioEntity> tblInventario;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    List<InventarioEntity> lstInventario = new ArrayList<>();

    InventarioEntity inventario;

    @FXML
    void agregar(ActionEvent event) {
        String cod = txtCodigo.getText();
        String desc = txtDescripcion.getText();
        String cant = txtCantidad.getText();

        //--
        inventario = new InventarioEntity();
        inventario.setCodigo(cod);
        inventario.setDescripcion(desc);
        inventario.setCantidad(Integer.valueOf(cant));
        lstInventario.add(inventario);

        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");

        mostrarGrilla(lstInventario);
    }

    private void mostrarGrilla(List<InventarioEntity> lstInventario2) {
        tblInventario.getItems().clear();

        tbcCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        tbcDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        tbcCantidad.setCellValueFactory(new PropertyValueFactory<>("Cantidad"));

        ObservableList<InventarioEntity> items = FXCollections.observableArrayList(lstInventario2);
        tblInventario.setItems(items);
    }

}
