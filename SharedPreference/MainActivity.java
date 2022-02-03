package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sp;
    EditText ee,er;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ee=(EditText)findViewById(R.id.e1);
        er=(EditText)findViewById(R.id.e2);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn){
            String s = ee.getText().toString();
            String a = er.getText().toString();

            sp=getSharedPreferences("Details",MODE_PRIVATE);
            SharedPreferences.Editor editor=sp.edit();

            editor.putString("username",s);
            editor.putString("password",a);
            editor.commit();

            Intent i = new Intent(this,Main2Activity.class);
            startActivity(i);
        }
    }
}
