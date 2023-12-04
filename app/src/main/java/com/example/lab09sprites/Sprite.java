package com.example.lab09sprites;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class Sprite extends RectF {
    private int dX, dY, color;
    public Sprite(float left, float top, float right, float bottom, int dX, int dY, int color) {
        super(left, top, right, bottom);
        this.dX=dX;
        this.dY=dY;
        this.color = color;
    }

    public Sprite(float left, float top, float right, float bottom) {
        this(left, top, right, bottom,1, 2, Color.MAGENTA);
    }

    public Sprite(int dX, int dY, int color) {
        this(1, 1, 11, 11, dX, dY, color);
    }

    public Sprite() {
        this(2, 3, Color.GREEN);
    }

    public void update(){
        offset(dX, dY);
    }
    public void draw(Canvas canvas){
        Paint paint= new Paint();
        paint.setColor(color);
        canvas.drawCircle(centerX(), centerY(), width()/2, paint);
    }
}
