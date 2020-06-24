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
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("SuperChat");
        Scene scene = new Scene(root, 350, 385);
        primaryStage.setScene(scene);

        primaryStage.getIcons().add(new Image("./img/icon.jpg"));
       // scene.getStylesheets().add((getClass().getResource("/css/Styles.css")).toExternalForm());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
