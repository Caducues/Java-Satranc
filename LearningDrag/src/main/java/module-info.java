module com.example.learningdrag {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learningdrag to javafx.fxml;
    exports com.example.learningdrag;
}