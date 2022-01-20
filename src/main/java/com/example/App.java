package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 640, 480, Color.WHITE);
        
        final Canvas canvas = new Canvas(250, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
         
        gc.setFill(Color.BLUE);
        gc.fillRect(75,75,100,100);
         
        root.getChildren().add(canvas);

        stage.setTitle("Sample");
        stage.setScene(scene);
        stage.show();
    }
}