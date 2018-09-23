package com.example.quizuno.retodeezer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.deezer.sdk.model.Album;
import com.deezer.sdk.network.connect.DeezerConnect;
import com.deezer.sdk.network.request.DeezerRequest;
import com.deezer.sdk.network.request.DeezerRequestFactory;
import com.deezer.sdk.network.request.event.JsonRequestListener;
import com.deezer.sdk.network.request.event.RequestListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_listas;
    EditText et_busqueda;
    Button btn_buscar;

    ListasAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_busqueda = findViewById(R.id.et_busqueda);
        btn_buscar = findViewById(R.id.btn_buscar);

        lv_listas=findViewById(R.id.lv_listas);

        customAdapter = new ListasAdapter(this);
        lv_listas.setAdapter(customAdapter);

        Lista lista1 = new Lista("EDM", "BitBird Radio", "102" );
        customAdapter.agergarLista(lista1);

        lv_listas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Lista lista_click = (Lista) customAdapter.getItem(position);
                Toast.makeText(MainActivity.this, lista_click.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });


        String applicationID = "298324";
        DeezerConnect deezerConnect = new DeezerConnect(this, applicationID);

        RequestListener listener = new JsonRequestListener() {

            public void onResult(Object result, Object requestId) {
                List<Album> albums = (List<Album>) result;
                Log.e("DEEZER", "Albumes:"+albums.size());

                // do something with the albums
            }

            public void onUnparsedResult(String requestResponse, Object requestId) {

            }

            public void onException(Exception e, Object requestId) {

            }
        };

// create the request
        long artistId = 11472;
        DeezerRequest request = DeezerRequestFactory.requestArtistAlbums(artistId);

        // set a requestId, that will be passed on the listener's callback methods
        request.setId("myRequest");

// launch the request asynchronously
        deezerConnect.requestAsync(request, listener);


        }
}
