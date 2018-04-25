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

/**
 * Created by Maxime on 24/04/2018.
 */

public class ListeGrilleActivity extends Activity {

    private String[] grilles_faciles = new String[]{
            "1", "2", "3", "4", "5", "6",
            "7", "8", "9", "10"
    };

    private String[] grilles_moyen = new String[]{
            "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_grille);
        final ListeGrilleActivity context = this;
        Bundle level = context.getIntent().getExtras();
        Log.e("value", ""+level.get("level"));

        ListView list = this.findViewById(R.id.grille);

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
