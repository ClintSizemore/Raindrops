//Clint Sizemore
package edu.up.raindrops;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SimpleController
        implements SeekBar.OnSeekBarChangeListener{
    private int _progress = 0;
    private Create _create;
    private int x;
    private int y;


    public SimpleController(Create create){
        _create = create;
        x = _create.getMainX();
        y = _create.getMainY();
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int progressed = seekBar.getProgress();
        if(seekBar.getId()== R.id.horiz){
            _create.setX(progressed);
        }
        else if(seekBar.getId()== R.id.vert){
            _create.setY(progressed);
        }
        _create.invalidate();
        _create.check();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {/*not used*/}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {/*not used*/}
}
