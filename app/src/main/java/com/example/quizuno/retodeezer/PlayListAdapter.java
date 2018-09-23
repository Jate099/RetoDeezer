package com.example.quizuno.retodeezer;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayListAdapter extends BaseAdapter {

    ArrayList<Cancion> canciones;
    Activity activity;

    public PlayListAdapter(Activity activity){
        this.activity = activity;
        canciones = new ArrayList<>();
    }
    @Override
    public int getCount() {
        return canciones.size();
    }

    @Override
    public Object getItem(int i) {
        return canciones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public View getView(final int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        View cancion = inflater.inflate(R.layout.cancion, null, false);
        TextView item_name = cancion.findViewById(R.id.item_name);
        TextView item_artista = cancion.findViewById(R.id.item_artista);
        Button item_cancion = cancion.findViewById(R.id.item_cancion);

        item_name.setText(canciones.get(position).getName());
        item_artista.setText(canciones.get(position).getArtista());

        item_cancion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(activity, Song.class);
                //activity.startActivity(intent);

            }
        });


        return cancion;
    }
     public void agergarLista(Cancion cancion) {
         canciones.add(cancion);
         notifyDataSetChanged();
     }
}
