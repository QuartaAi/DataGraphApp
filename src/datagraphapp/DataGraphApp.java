/*
 * dataGraphApp: un'applicazione per disegnare grafi 
 * da una serie di dati.
 */

package datagraphapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
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
        
        stage.setTitle("Data Graph Application");
        Group root = new Group();
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Drawer d = new Drawer(gc);
        
        for (int i = -100; i <= 100; i+=10) {
            System.out.println(i + " --> " + d.convertToY(i));
        }
        
        int[] v = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100 };
        // d.drawAxes();
          d.drawBars( v );
        
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
