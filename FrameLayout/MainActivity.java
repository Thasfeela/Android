package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout ll;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll);
        im=(ImageView)findViewById(R.id.im);
        ll.setOnClickListener(this);
        im.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ll){
            ll.setVisibility(View.GONE);
            im.setVisibility(View.VISIBLE);
        }else{
            ll.setVisibility(View.VISIBLE);
            im.setVisibility(View.GONE);
        }
    }
}
