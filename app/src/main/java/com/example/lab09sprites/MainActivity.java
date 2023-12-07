package com.example.lab09sprites;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    DrawView drawView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        drawView=findViewById(R.id.drawView);
        /**
         * Option way of getting fullscreen and no title
         * //Set fullscreen
         * this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
         *        WindowManager.LayoutParams.FLAG_FULLSCREEN);
         *
         * //Set No Title
         * this.requestWindowFeature(Window.FEATURE_NO_TITLE);
         **/
    }

    public void moveLeft(View view) {
        drawView.sprite.setdX(-3);//set horizontal speed to move left
    }

    public void moveRight(View view) {
        drawView.sprite.setdX(3);//set horizontal speed to move right
    }
}