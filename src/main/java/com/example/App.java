package com.example;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static final double HEIGHT = 500;
    private static final double WIDTH = 500;
    private static Group root;

    @Override
    public void start(Stage stage) throws IOException {

        root = new Group();
        branch(new Point2D(WIDTH/2, HEIGHT), -90, HEIGHT/4);
        Scene scene = new Scene(root,WIDTH,HEIGHT,Color.GREY);
        stage.setScene(scene);
        stage.setTitle("Fractal Tree");
        stage.setResizable(false);
        stage.show();

    }


    /**
     * @param origin  the x and y on where to start drawing
     * @param rotation degrees
     * @param len  how long the line should be (pixels)
     */
    private static void branch(Point2D origin,double rotation,double len){

        Point2D destination = endPoint(origin, rotation, len);
        Line line = new Line(origin.getX(),origin.getY(),destination.getX(),destination.getY());
       /*  int red = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        line.setStroke(Color.rgb(red, green, blue));*/
        line.setStroke(Color.WHITE);
        line.setStrokeWidth(1.5);
        root.getChildren().add(line);
        if(len >4){ // (best case)
           branch(destination, rotation-35, len*0.67); 
           branch(destination, rotation+35, len*0.67);
        }
        
    }

    private static Point2D endPoint(Point2D origin, double rotation,double len){
        double x = origin.getX();
        double y = origin.getY();

        double radians = rotation* Math.PI/180.0;  // from degree to radians 

        x += (len*Math.cos(radians));  
        y += (len*Math.sin(radians));
        

        return new Point2D(x, y);
    }




    public static void main(String[] args) {
        launch();
    }

}