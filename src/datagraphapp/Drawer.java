/*
 * Drawer: Una classe che disegna su un contesto grafico.
 */

package datagraphapp;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author 4Ai A.S. 2014/2015 
 */
public class Drawer {
    
    GraphicsContext cxt;
    double w, h;
    
    public Drawer (GraphicsContext c) {
        this.cxt = c;
        this.w = cxt.getCanvas().getWidth();
        this.h = cxt.getCanvas().getHeight();
        cxt.setLineWidth(1);
        cxt.setStroke(Color.RED);
        cxt.setFill(Color.YELLOW);
    }
    
    public void drawAxes () {
        Paint old_p = cxt.getStroke();
        cxt.setStroke(Color.BLUE);
        cxt.strokeLine(w/2, h, w/2, 0); // ordinata
        cxt.strokeLine(0, h/2, w, h/2); // ascissa
        cxt.strokeLine(w/2., 0, w/2 + (w*2)/100, (h*5)/100);
        cxt.strokeLine(w/2., 0, w/2 - (w*2)/100, (h*5)/100);
        cxt.strokeLine(w, h/2, w - (w*5)/100, h/2 + (h*2)/100);
        cxt.strokeLine(w, h/2, w - (w*5)/100 , h/2 - (h*2)/100);
        cxt.setStroke(old_p);
    }

    public void drawBar( int x, int y, int w, int h ) {
        cxt.strokeRect(x, y, w, h);
        cxt.fillRect(x, y, w, h);
    }

    void drawBars(int[] v) {
        
        int bars = v.length;
        if ( w/4 < bars ) {
            System.out.println("Quanto mi dispiace!");
            System.out.println("w=" + w + "; bars=" + bars);
            return;
        }
        int bw = (int) (w - bars) / bars;
        for (int i = 0; i < bars; i++) {
            int uly, bh;
            if ( v[i]>=0 ) {
                uly = (100-v[i]) * (int)((h/2)/100);
                bh = (int)(h/2) - uly;
            } else {
                uly = (int)h/2;
                bh = (100+v[i]) * (int)((h/2)/100);
            }
            drawBar( i*(bw+1), uly, bw, bh );
        }
        
        
    }
    
}
