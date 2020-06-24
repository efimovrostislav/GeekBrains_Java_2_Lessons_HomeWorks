package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea chatBox;

    @FXML
    TextField textField;

    public void sendMsg() {
        chatBox.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
