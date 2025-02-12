//Clint Sizemore 2/11/2025
package edu.up.raindrops;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Drop {
    int _xCord;
    int _yCord;
    private Paint paint;

    //Sets random x and y coords and random rgb values
    public Drop(){
        _xCord = (int)(Math.random()*800);
        _yCord = (int)(Math.random()*800);
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        //creates and sets random color
        int color = Color.rgb(r,g,b);
        paint = new Paint(color);
        paint.setColor(color);
    }

    //Called to draw drops in main method
    public void paintDrop(Canvas canvas){
        canvas.drawCircle(_xCord,_yCord,30,paint);
    }
}
