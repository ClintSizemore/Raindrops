//Clint Sizemore 2/11/2025
package edu.up.raindrops;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class Create extends SurfaceView {
    //initializes class according to reference
    public Create(Context context, AttributeSet attrs){
        super(context, attrs);
        setWillNotDraw(false);

        Canvas canvas = new Canvas();

    }
    //Actually draws 6-12 drops
    @Override
    public void onDraw(Canvas canvas){
        int drops = (int)(Math.random()*6+7);
        for(int i = 0; i < drops; ++i) {
            new Drop().paintDrop(canvas);
        }
    }
}
