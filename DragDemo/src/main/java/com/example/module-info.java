module com.example.dragdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dragdemo to javafx.fxml;
    exports com.example.dragdemo;
}