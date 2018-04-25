package com.example.maxime.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MainActivity context = this;

        Button facile = this.findViewById(R.id.facile);
        facile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.e("Message log", "click facile");
                Intent intent = new Intent(context, ListeGrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

        Button moyen = this.findViewById(R.id.moyen);
        moyen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.e("Message log", "click moyen");
                Intent intent = new Intent(context, ListeGrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

        Button difficile = this.findViewById(R.id.difficile);
        difficile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.e("Message log", "click difficile");
                Intent intent = new Intent(context, ListeGrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

    }

}
