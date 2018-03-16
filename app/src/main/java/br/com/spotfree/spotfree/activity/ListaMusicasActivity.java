package br.com.spotfree.spotfree.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.spotfree.spotfree.R;
import br.com.spotfree.spotfree.adapter.MusicasAdapter;
import br.com.spotfree.spotfree.model.Musicas;

/**
 * Created by re_ja on 15/03/2018.
 */

public class ListaMusicasActivity extends AppCompatActivity {

    List<Musicas> listaMusicas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_musicas);

        ListView listviewMusicas = findViewById(R.id.ListViewListaMusicas);
        listaMusicas = new ArrayList<>();

        Musicas m1 = new Musicas();
        m1.setArtista("Artista 1");
        m1.setNome("Musica 1");

        Musicas m2 = new Musicas();
        m2.setArtista("Artista 2");
        m2.setNome("Musica 2");

        Musicas m3 = new Musicas();
        m3.setArtista("Artista 3");
        m3.setNome("Musica 3");

        Musicas m4 = new Musicas();
        m4.setArtista("Artista 4");
        m4.setNome("Musica 4");

        listaMusicas.add(m1);
        listaMusicas.add(m2);
        listaMusicas.add(m3);
        listaMusicas.add(m4);

        MusicasAdapter musicaAdapter = new MusicasAdapter(this, listaMusicas);

        listviewMusicas.setAdapter(musicaAdapter);

        listviewMusicas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Musicas musicaClicada = listaMusicas.get(position);

                Intent i = new Intent(ListaMusicasActivity.this, DetalheMusicasActivity.class);
                startActivity(i);

            }
        });
    }
}
