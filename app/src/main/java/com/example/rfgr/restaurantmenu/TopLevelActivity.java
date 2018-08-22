package com.example.rfgr.restaurantmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        /**Ponieżej został utworzony obiekt nasłuchujący OnClickListner */
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) { //wykorzystująć if statement możemy określić co się stanie gdy zostanie wciśnięty określony parametr listy
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(TopLevelActivity.this, SnackCategoryActivity.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Toast.makeText(TopLevelActivity.this, R.string.toastMessage, Toast.LENGTH_SHORT).show();
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.lista_menu);
        listView.setOnItemClickListener(itemClickListener);
    }
}
