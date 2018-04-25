package com.example.maxime.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Maxime on 24/04/2018.
 */


public class GrilleActivity extends Activity {

    ArrayList<Integer> list = new ArrayList<>();
    String sudoku = "001700509573024106800501002700295018009400305652800007465080071000159004908007053";

    public GrilleActivity () {
//        GrilleView grilleView = new GrilleView();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grille);

//        final GrilleActivity context = this;
//
//        GridView grille_sudoku = this.findViewById(R.id.grille_final);
//        for (int i =0; i<81;i++){
//            list.add((int)sudoku.charAt(i));
//        }
//        ArrayAdapter<Integer> arrayAdapter
//                = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1 , list);
//
//
//        grille_sudoku.setAdapter(arrayAdapter);

    }





}


