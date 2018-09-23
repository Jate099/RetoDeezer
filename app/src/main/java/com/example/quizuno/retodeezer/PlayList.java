package com.example.quizuno.retodeezer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class PlayList extends AppCompatActivity {

    private ListView lv_canciones;
    TextView et_nombre;
    TextView et_creador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_completa);

        et_nombre = findViewById(R.id.et_nombre);
        et_creador = findViewById(R.id.et_creador);
    }
}
