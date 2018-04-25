package com.example.maxime.sudoku;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Maxime on 24/04/2018.
 */

public class GrilleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grille);

//        Scanner sc = new Scanner(System.in);

//        int [][] plateauEntree = new int [8][8];

//        for (int i=0;i<8 ;i++ ) {
//            String entree = sc.nextLine();
//            plateauEntree[i]=entree.toCharArray();
//            for (int j=0;j<81;j++){
//            plateauEntree[i][j] = i+j;
//            Log.e("TAG", ""+plateauEntree[i][j]);
//        }
//        }
    }
}
