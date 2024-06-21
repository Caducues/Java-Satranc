module com.mycompany.satranc2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.satranc2 to javafx.fxml;
    exports com.mycompany.satranc2;
}
