package com.example.learningdrag;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private AnchorPane asd;

    private double startX;
    private double startY;

    public void start()
    {

        asd.setOnMousePressed(event -> {
            startX = event.getSceneX() -asd.getTranslateX();
            startY = event.getSceneY() -asd.getTranslateY();
        });
        asd.setOnMouseDragged(event -> {
            asd.setTranslateX(event.getSceneX() - startX);
            asd.setTranslateY(event.getSceneY() - startY);

        });

    }

}
