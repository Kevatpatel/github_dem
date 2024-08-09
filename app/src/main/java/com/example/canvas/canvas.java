package com.example.canvas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Color;
import android.widget.ImageView;

public class canvas extends AppCompatActivity {
    private ImageView i;
    private Bitmap b;
    private Canvas c;
    private Paint p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        int w=800;
        int p=600;
        b=Bitmap.createBitmap(800,600,Bitmap.Config.ARGB_8888);
        c=new Canvas(b);
        i=new ImageView(this);
        p1=new Paint();
        c.drawColor(Color.argb(255,0,255,0));
        p1.setTextSize(100);
        p1.setColor(Color.argb(255,255,255,255));
        c.drawText("canvas demo",100,100,p1);
        p1.setColor(Color.argb(255,0,0,255));
        c.drawCircle(400,250,100,p1);
        i.setImageBitmap(b);
        setContentView(i);




    }
}