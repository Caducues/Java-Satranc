module com.example.satranc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires jdk.jfr;


    opens com.example.satranc to javafx.fxml;
    exports com.example.satranc;
}