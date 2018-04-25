package com.example.maxime.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Maxime on 24/04/2018.
 */

public class ListeGrilleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_grille);
        final ListeGrilleActivity context = this;

        Button grille1 = this.findViewById(R.id.grille1);
        grille1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.e("Message log", "click facile");
                Intent intent = new Intent(context, GrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

        Button grille2 = this.findViewById(R.id.grille2);
        grille2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.e("Message log", "click moyen");
                Intent intent = new Intent(context, GrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

        Button grille3 = this.findViewById(R.id.grille3);
        grille3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.e("Message log", "click difficile");
                Intent intent = new Intent(context, GrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

    }
}
