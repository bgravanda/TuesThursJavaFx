package bsu.comp152.tuesthursjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        var testColor = Paint.valueOf("Blue");
        var BigFont = Font.font(20);
        welcomeText.setTextFill(testColor);
        welcomeText.setFont(BigFont);
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}