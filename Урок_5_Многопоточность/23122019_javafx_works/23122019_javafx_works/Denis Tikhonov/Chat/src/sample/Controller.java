package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;
    @FXML
    MenuItem nickname;
    @FXML
    MenuItem clear;
    @FXML
    MenuItem close;

    public void clearWindow() {
        textArea.clear();
    }

    public void closeWindow() {
        Platform.exit();
    }

    public void standardStyle() {
        changeCSS("/css/Style.css");
    }

    public void walStyle() {
        changeCSS("/css/Wall.css");
    }

    public void fenceStyle() {
        changeCSS("/css/Fence.css");
    }

    private void changeCSS(String s) {
        textArea.getScene().getStylesheets().clear();
        textArea.getScene().getStylesheets().add(getClass().getResource(s).toExternalForm());
    }

    public void info() throws IOException {
        Image imageInfo = new Image("file:images/info.jpg");
        Stage infoWindow = new Stage();

        Parent rootInfo = FXMLLoader.load(getClass().getResource("info.fxml"));
        infoWindow.setTitle("Info");
        infoWindow.getIcons().add(imageInfo);
        infoWindow.setScene(new Scene(rootInfo, 350, 100));
        infoWindow.show();
    }

    public void about() throws IOException {
        Image imageInfo = new Image("file:images/about.png");
        Stage infoWindow = new Stage();

        Parent rootInfo = FXMLLoader.load(getClass().getResource("about.fxml"));
        infoWindow.setTitle("About");
        infoWindow.getIcons().add(imageInfo);
        infoWindow.setScene(new Scene(rootInfo, 350, 100));
        infoWindow.show();
    }

    public void sendMsg(){
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
