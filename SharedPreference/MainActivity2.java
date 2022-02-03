package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t,p;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView)findViewById(R.id.tv);
        p = (TextView)findViewById(R.id.tt);
        sp = getSharedPreferences("Details",MODE_PRIVATE);
         if(sp.contains("username")) {
             String v = sp.getString("username", "no user");
             t.setText(v);
         }
         if(sp.contains("password")){
             String b = sp.getString("password","no password");
             p.setText(b);
         }
    }
}
