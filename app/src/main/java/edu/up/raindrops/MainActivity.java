//Clint Sizemore
package edu.up.raindrops;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Initializes classes
        Create wetSurface = this.findViewById(R.id.wetSurface);
        SimpleController ctrl = new SimpleController(wetSurface);

        //Sets slider bars at the beginning
        SeekBar xSlider = this.findViewById(R.id.vert);
        SeekBar ySlider = this.findViewById(R.id.horiz);
        xSlider.setProgress(ctrl.getX());
        ySlider.setProgress(ctrl.getY());

        //Edits sliders bars when moved
        xSlider.setOnSeekBarChangeListener(ctrl);
        ySlider.setOnSeekBarChangeListener(ctrl);
    }
}