package com.example.utsgithub_ferdi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        CircleImageView imageView  = findViewById(R.id.myGates);
        TextView textview1 = findViewById(R.id.textv1);
        TextView  textview2 = findViewById(R.id.textv2);
        TextView textview3  = findViewById(R.id.textv3);
        TextView textview4  = findViewById(R.id.texttv4);
        TextView textview5 = findViewById(R.id.texttv5);
        TextView textview6 = findViewById(R.id.texttv6);
        TextView textview7 = findViewById(R.id.texttv7);
        TextView textview8 = findViewById(R.id.texttv8);
        TextView textview9 = findViewById(R.id.texttv9);
        TextView textview10 = findViewById(R.id.texttv10);



        Myitem myitem = getIntent().getParcelableExtra("Myitem");
        imageView.setImageResource(myitem.getMimageResource());
        textview1.setText(myitem.getmText1());
        textview2.setText(myitem.getmText2());
        textview3.setText(myitem.getmText3());
        textview4.setText(myitem.getmText4());
        textview5.setText(myitem.getmText5());
        textview6.setText(myitem.getmText6());
        textview7.setText(myitem.getmText7());
        textview8.setText(myitem.getmText8());
        textview9.setText(myitem.getmText9());
        textview10.setText(myitem.getmText10());
    }
}