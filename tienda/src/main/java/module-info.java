module com.tienda.lemas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tienda.lemas to javafx.fxml;
    exports com.tienda.lemas;
}
