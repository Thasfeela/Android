package com.example.custome_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        Typeface myfont = Typeface.createFromAsset(getAssets(),"font/ArianaVioleta-dz2K.ttf");
        tv.setTypeface(myfont);
    }
}
