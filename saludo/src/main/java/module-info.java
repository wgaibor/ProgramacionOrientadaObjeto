module com.lemas.saludo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lemas.saludo to javafx.fxml;
    exports com.lemas.saludo;
}
