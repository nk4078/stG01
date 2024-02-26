package com.example.stg01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tB;
    Switch sH;
    Button btn;
    ImageView iM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tB = (ToggleButton) findViewById(R.id.tB);
        btn = (Button) findViewById(R.id.btn);
        sH = (Switch) findViewById(R.id.sH);
        iM = (ImageView) findViewById(R.id.iM);
    }

    public void clicked(View view) {
        if(tB.isChecked()==true && sH.isChecked()==true){
            iM.setImageResource(R.drawable.num1);
        }
        if(tB.isChecked()==false && sH.isChecked()==true) {
            iM.setImageResource(R.drawable.num2);
        }
        if(tB.isChecked()==true && sH.isChecked()==false) {
            iM.setImageResource(R.drawable.num3);
        }
        if(tB.isChecked()==false && sH.isChecked()==false) {
            iM.setImageResource(R.drawable.num4);
        }
    }
}