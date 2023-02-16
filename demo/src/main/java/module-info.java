module ec.com.loteria {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.com.loteria to javafx.fxml;
    exports ec.com.loteria;
}
