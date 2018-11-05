package com.example.rizvyahmed.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LinearLayout galary=findViewById(R.id.gallary);
        LayoutInflater inflater=LayoutInflater.from(this);

        for (int i=0;i<6;i++){
            View view=inflater.inflate(R.layout.item,galary,false);
            TextView textView=view.findViewById(R.id.textView);
            textView.setText("Item"+i);

            ImageView imageView=view.findViewById(R.id.imageView);
            imageView.setImageResource(R.mipmap.ic_launcher);
            galary.addView(view);
        }
        LinearLayout galary2=findViewById(R.id.gallary2);
        LayoutInflater inflate=LayoutInflater.from(this);
        for (int i=0;i<6;i++){
            View v=inflate.inflate(R.layout.item,galary2,false);
            TextView textView=v.findViewById(R.id.textView);
            textView.setText("Item" +i);

            ImageView imageView=v.findViewById(R.id.imageView);
            imageView.setImageResource(R.mipmap.ic_launcher);
            galary2.addView(v);
        }

        LinearLayout galary3=findViewById(R.id.gallary3);
        LayoutInflater inflat=LayoutInflater.from(this);
        for (int i=0;i<6;i++){
            View view2=inflat.inflate(R.layout.item,galary2,false);
            TextView textView=view2.findViewById(R.id.textView);
            textView.setText("Item" +i);

            ImageView imageView=view2.findViewById(R.id.imageView);
            imageView.setImageResource(R.mipmap.ic_launcher);
            galary3.addView(view2);
        }

    }
}
