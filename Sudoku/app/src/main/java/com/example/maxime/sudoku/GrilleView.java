package com.example.maxime.sudoku;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Maxime on 25/04/2018.
 */

public class GrilleView extends View implements View.OnTouchListener {

    ArrayList<Integer> list = new ArrayList<>();
    StringBuilder sudoku = new StringBuilder("001700509573024106800501002700295018009400305652800007465080071000159004908007053");
    int screenwidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    int screenheight = Resources.getSystem().getDisplayMetrics().heightPixels;
    int block = screenwidth/9;
    int value_x = 0;
    int value_y = 0;
    char number ;

    public GrilleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(this);
    }
    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setTextSize(50);


        double reduce = 0.5;

        /**trace les traits */
        for (int i =1;i<10;i++){
            if (i%3==0){
                paint.setStrokeWidth(20);
            }
            canvas.drawLine(block*i,0,block*i,screenwidth,paint);
            canvas.drawLine(0,block*i,screenheight,block*i,paint);
            paint.setStrokeWidth(5);
        }

        /** remplie la grille */
        for (int i =0; i<9;i++){
            for (int j=0;j<9;j++){
                float reduce_i =i+Float.parseFloat(String.valueOf(reduce)); /** sale */
                float reduce_j =j+Float.parseFloat(String.valueOf(reduce)); /** sale */
//                Log.e("TAG", ""+reduce +" "+reduce_i+" "+reduce_j);

                if (sudoku.charAt(i+9*j) != '0'){
                    canvas.drawText(""+sudoku.charAt(i+9*j),(block)*(reduce_i)-15,(block)*(reduce_j)+15,paint);
                }
            }
        }

        for (int i = 0;i<9;i++){
            paint.setTextSize(50);
            canvas.drawText(""+(i+1),(block)*(i)+45, (block)*(10)+15,paint);
        }
// up move down


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x  = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int verif_x = 0;

        if (y<1250 && y>1150){
            Log.e("TAG", "x/y: " + x + " " + y +" "+block+" "+verif_x); /** block=120 */
            verif_x = x/block +1;
        }

            switch (motionEvent.getAction()){
                case MotionEvent.ACTION_DOWN:
                    number = Integer.toString(verif_x).charAt(0);
                    break;
                case MotionEvent.ACTION_MOVE:
                    break;
                case MotionEvent.ACTION_UP:

                    value_y = y/block;
                    value_x = x/block;
                    //                maj du string
                    Log.e("CHAR AT", "x: "+(x/block+1)+" y: "+(y/block+1)+" num: "+number+" vx: "+value_x+" vy: "+value_y);
                    sudoku.setCharAt(value_x+value_y*9,number);
                    break;
            }

        this.invalidate();
        return true;
    }
}
