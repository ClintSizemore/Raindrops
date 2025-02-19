//Clint Sizemore
package edu.up.raindrops;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Drop {
    int _xCord;
    int _yCord;
    private Paint paint;
    private int gone = Color.argb(0,0,0,0);

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

    //Position Setters
    public void setX(int x){
        _xCord = x;
    }
    public void setY(int y){
        _yCord = y;
    }
    //Position Getters
    public int getX(){
        return _xCord;
    }
    public int getY(){
        return _yCord;
    }
    //Color Setter
    public void setW(){
        paint.setColor(gone);
    }
}
