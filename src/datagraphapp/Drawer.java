/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datagraphapp;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author giacomo
 */
public class Drawer {
    
    GraphicsContext cxt;
    double w, h;
    
    public Drawer (GraphicsContext c) {
        this.cxt = c;
        this.w = cxt.getCanvas().getWidth();
        this.h = cxt.getCanvas().getHeight();
    }
    
    public void drawAxes (Color color, double lineWidth) {
        // Draw basic axes:
        cxt.setStroke(color);
        cxt.setLineWidth(lineWidth);
        cxt.strokeLine(w/2., 0, w/2, h);
        cxt.strokeLine(0, h/2, w, h/2);
        
        // Draw arrows:
        // Y:
        cxt.strokeLine(w/2., 0, w/2 + (w*2)/100, (h*5)/100);
        cxt.strokeLine(w/2., 0, w/2 - (w*2)/100, (h*5)/100);
        // X:
        cxt.strokeLine(w, h/2, w - (w*5)/100, h/2 + (h*2)/100);
        cxt.strokeLine(w, h/2, w - (w*5)/100 , h/2 - (h*2)/100);
    }
    
}
