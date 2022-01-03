package com.example.librariacusemne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = findViewById(R.id.listview);

        String[] values = new String[]{
                "Animale", "Persoane", "Culori",
                "Obiecte", "Verbe", "Emotii"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(view.getContext(), Activity_Animale.class);
                    startActivity(intent);
                }

                if(position == 1){
                    Intent intent = new Intent(view.getContext(), Activity_Persoane.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(view.getContext(), Activity_Culori.class);
                    startActivity(intent);
                }

                if(position == 3){
                    Intent intent = new Intent(view.getContext(), Activity_Obiecte.class);
                    startActivity(intent);
                }

                if(position == 4){
                    Intent intent = new Intent(view.getContext(), Activity_Verbe.class);
                    startActivity(intent);
                }

                if(position == 5){
                    Intent intent = new Intent(view.getContext(), Activity_Emotii.class);
                    startActivity(intent);
                }

            }
        });



    }
}