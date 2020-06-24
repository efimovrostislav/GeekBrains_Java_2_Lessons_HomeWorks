package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Image image = new Image("file:images/icon.png");
        primaryStage.getIcons().add(image);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Super CHAT");
        primaryStage.setScene(new Scene(root, 300, 500));
        primaryStage.getScene().getStylesheets().add("/css/Style.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
