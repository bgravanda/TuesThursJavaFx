package bsu.comp152.tuesthursjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondWindow {
    @FXML
    private Label helloLabel;

    @FXML
    protected void HelloClicked(){
        helloLabel.setText("we set it up our selves this time");
    }
}
