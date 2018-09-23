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

public class ListasAdapter extends BaseAdapter {

   ArrayList<Lista> listas;
    Activity activity;

    public ListasAdapter(Activity activity){
        this.activity = activity;
        listas = new ArrayList<>();
    }
    @Override
    public int getCount() {
        return listas.size();
    }

    @Override
    public Object getItem(int i) {
        return listas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        View renglon = inflater.inflate(R.layout.renglon, null, false);
        TextView item_nombre = renglon.findViewById(R.id.item_nombre);
        TextView item_creador = renglon.findViewById(R.id.item_creador);
        TextView item_elementos = renglon.findViewById(R.id.item_elementos);
        Button item_ir = renglon.findViewById(R.id.item_ir);

        item_nombre.setText(listas.get(position).getNombre());
        item_creador.setText(listas.get(position).getCreador());
        item_elementos.setText(listas.get(position).getElementos());

        item_ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, PlayList.class);
                activity.startActivity(intent);
            }
        });

        return renglon;
    }

    public void agergarLista(Lista lista){
        listas.add(lista);
        notifyDataSetChanged();

    }
}
