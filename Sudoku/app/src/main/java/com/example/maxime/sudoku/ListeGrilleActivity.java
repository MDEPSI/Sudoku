package com.example.maxime.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Maxime on 24/04/2018.
 */

public class ListeGrilleActivity extends Activity {

    private String[] grilles_faciles = new String[]{
            "Facile 1", "Facile 2", "Facile 3", "Facile 4", "Facile 5", "Facile 6",
            "Facile 7", "Facile 8", "Facile 9", "Facile 10"
    };

    private String[] grilles_moyen = new String[]{
            "Moyen 11", "Moyen 12", "Moyen 13", "Moyen 14", "Moyen 15", "Moyen 16",
            "Moyen 17", "Moyen 18", "Moyen 19", "Moyen 20"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_grille);
        final ListeGrilleActivity context = this;
        Bundle level = context.getIntent().getExtras();
        Log.e("value", ""+level.get("level"));

        ListView list = this.findViewById(R.id.grille);
        for (int i =0; i<grilles_faciles.length; i++) {
            int r = new Random().nextInt(101);
            grilles_faciles[i] = grilles_faciles[i]+" - "+r+"%";
        }
        for (int i =0; i<grilles_moyen.length; i++) {
            int r = new Random().nextInt(101);
            grilles_moyen[i] = grilles_moyen[i]+" - "+r+"%";
        }

        if (level.get("level").equals("facile")){
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListeGrilleActivity.this,
                    android.R.layout.simple_list_item_1, grilles_faciles);
            list.setAdapter(adapter);
        } else if (level.get("level").equals("moyen")) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListeGrilleActivity.this,
                    android.R.layout.simple_list_item_1, grilles_moyen);
            list.setAdapter(adapter);
        }



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View view, int arg2,long itemID) {

                Intent intent = new Intent(context, GrilleActivity.class); /* contener*/
                context.startActivity(intent);
            }
        });

    }
}
