package com.example.maxime.sudoku;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Maxime on 25/04/2018.
 */

public class GrilleView extends View {

    ArrayList<Integer> list = new ArrayList<>();
    String sudoku = "001700509573024106800501002700295018009400305652800007465080071000159004908007053";

    public GrilleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        paint.setTextSize(50);

        int screenwidth = Resources.getSystem().getDisplayMetrics().widthPixels;
        int screenheight = Resources.getSystem().getDisplayMetrics().heightPixels;
        int block = screenwidth/9;
        double reduce = 0.5;

        for (int i =1;i<10;i++){
            canvas.drawLine(block*i,0,block*i,screenwidth,paint);
            canvas.drawLine(0,block*i,screenheight,block*i,paint);
        }

        for (int i =0; i<9;i++){
//            list.add((int)sudoku.charAt(i));
            for (int j=0;j<9;j++){
                float reduce_i =i+Float.parseFloat(String.valueOf(reduce)); /** sale */
                float reduce_j =j+Float.parseFloat(String.valueOf(reduce)); /** sale */
                Log.e("TAG", ""+reduce +" "+reduce_i+" "+reduce_j);
                if (sudoku.charAt(i+9*j) != '0'){
                    canvas.drawText(""+sudoku.charAt(i+9*j),(block)*(reduce_i),(block)*(reduce_j),paint);
                }
            }
        }
    }
}
