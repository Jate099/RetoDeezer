package com.example.quizuno.retodeezer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class Song extends AppCompatActivity {

    TextView tv_nombre;
    TextView tv_artista;
    TextView tv_album;
    TextView tv_duracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song);

        tv_nombre = findViewById(R.id.tv_nombre);
        tv_artista = findViewById(R.id.tv_artista);
        tv_album = findViewById(R.id.tv_album);
        tv_duracion = findViewById(R.id.tv_duracion);


    }
}
