//Clint Sizemore
package edu.up.raindrops;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class Create extends SurfaceView {
    Drop mainDrop;
    int drops = (int)(Math.random()*7+6);
    private Drop[] droray = new Drop[drops];
    private int mainX;
    private int mainY;

    //initializes class according to reference
    public Create(Context context, AttributeSet attrs){
        super(context, attrs);
        setWillNotDraw(false);

        Canvas canvas = new Canvas();

        for(int i = 0; i < droray.length; i++) {
            droray[i] = new Drop();
            if(i==0){
                mainX = droray[0].getX();
                mainY = droray[0].getY();
            }
        }

    }
    //Actually draws 6-12 drops
    @Override
    public void onDraw(Canvas canvas){

        for(int i = 0; i < droray.length; i++) {
            droray[i].paintDrop(canvas);
        }
    }

    public int getMainX(){
        return droray[0].getX();
    }
    public int getMainY(){
        return droray[0].getY();
    }

    public void setX(int x){
        mainDrop = droray[0];
        mainDrop.setX(x);
    }
    public void setY(int y){
        mainDrop = droray[0];
        mainDrop.setY(y);
    }
    public void check(){
        for(int i = 1; i < drops; i++)
            if(Math.abs(droray[0].getX() - droray[i].getX()) < 60 && Math.abs(droray[0].getY() - droray[i].getY()) < 60){
                droray[i].setW();
            }
    }

}
