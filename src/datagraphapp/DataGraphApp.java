/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datagraphapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author bel22887
 */
public class DataGraphApp extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        
        stage.setTitle("Draw Lines");
        
        Group root = new Group();
                
        Canvas canvas = new Canvas(640, 480);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        Drawer d = new Drawer(gc);
        
        d.drawAxes(Color.BLACK, 2);
        
        root.getChildren().add(canvas);
        
        stage.setScene(new Scene(root));
        
        stage.show();
    }
    
}
