package sample;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

import java.util.Random;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    ImageView imageSnow;

    @FXML
    Pane paneMain;


    public void sendMsg() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void sendSnow() {

        Image imgSnow = new Image("img/snow.png");
        imageSnow = new ImageView(imgSnow);
        generationLocateFitOpacity(imageSnow);
        chengeOpacity(imageSnow);
        createPathSnow(imageSnow, paneMain);
        rotetiomSnow(imageSnow);
        paneMain.getChildren().add(imageSnow);
    }

    public void endSendSnow() {

        for (int i = 0; i < 15; i++) {
            Image imgSnow = new Image("img/snow.png");
            imageSnow = new ImageView(imgSnow);
            generationLocateFitOpacity(imageSnow);
            chengeOpacity(imageSnow);
            createPathSnow(imageSnow, paneMain);
            rotetiomSnow(imageSnow);
            paneMain.getChildren().add(imageSnow);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }

    private void rotetiomSnow(ImageView imageSnow) {
        RotateTransition rotateTransition =
                new RotateTransition(Duration.millis(3000), imageSnow);
        rotateTransition.setByAngle(360f);
        rotateTransition.setCycleCount(4);
        rotateTransition.setAutoReverse(true);
        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                rotateTransition
        );
        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();
    }

    private void createPathSnow(ImageView imageSnow, Pane pane) {
        Path path = new Path();
        path.getElements().add(new MoveTo(20,20));
        path.getElements().add(new CubicCurveTo(100, 100, 20, 50, 15, paneMain.getHeight() / 2));
        path.getElements().add(new CubicCurveTo(100, 200, 10, 70, 5,  paneMain.getHeight()));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(6000));
        pathTransition.setPath(path);
        pathTransition.setNode(imageSnow);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(false);
        pathTransition.play();

    }

    private void chengeOpacity(ImageView imageSnow) {
        FadeTransition keyValue = new FadeTransition (Duration.millis(2000.0), imageSnow);
        keyValue.setFromValue(1.0);
        keyValue.setToValue(0.5);
        keyValue.setCycleCount(Timeline.INDEFINITE);
        keyValue.setAutoReverse(true);
        keyValue.play();
    }

    private void generationLocateFitOpacity(ImageView imageSnow) {
        imageSnow.relocate(randomGenerationLocationX(), 1);
        imageSnow.setOpacity(Math.random() * (0.5) + 0.5);
        imageSnow.setFitHeight(30);
        imageSnow.setFitWidth(30);
    }

    private int randomGenerationLocationX() {
        return new Random().nextInt((int) paneMain.getWidth());
    }
}
