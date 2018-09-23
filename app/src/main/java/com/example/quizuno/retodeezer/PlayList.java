package com.example.quizuno.retodeezer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class PlayList extends AppCompatActivity {

    private ListView lv_canciones;
    TextView et_nombre;
    TextView et_creador;

    PlayListAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);

        et_nombre = findViewById(R.id.et_nombre);
        et_creador = findViewById(R.id.et_creador);

        customAdapter = new PlayListAdapter(this);
        lv_canciones.setAdapter(customAdapter);

        Cancion cancion1 = new Cancion("Clocks", "ColdPlay");
        customAdapter.agergarLista(cancion1);
    }
}
