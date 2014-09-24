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
        Canvas canvas = new Canvas(640, 480);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Drawer d = new Drawer(gc);
        
        int[] v = {30, 12, 83, -29 };
        d.drawAxes();
        d.drawBars( v );
        // d.drawBar();
        
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
