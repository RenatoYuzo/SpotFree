package br.com.spotfree.spotfree.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.spotfree.spotfree.R;
import br.com.spotfree.spotfree.adapter.MusicasAdapter;
import br.com.spotfree.spotfree.model.Musicas;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by re_ja on 15/03/2018.
 */

public class ListaMusicasActivity extends AppCompatActivity {

    List<Musicas> listaMusicas;

    @BindView(R.id.ListViewListaMusicas)
    ListView listviewMusicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_musicas);
        ButterKnife.bind(this);

        listaMusicas = new ArrayList<>();

        Musicas m1 = new Musicas();
        m1.setArtista("Aerosmith");
        m1.setNome("I Don't Want to Miss a Thing");

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

        //ListView listviewMusicas = findViewById(R.id.ListViewListaMusicas);

        MusicasAdapter musicaAdapter = new MusicasAdapter(this, listaMusicas);

        listviewMusicas.setAdapter(musicaAdapter);

        listviewMusicas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Musicas musicaClicada = listaMusicas.get(i);

                /*Intent i = new Intent(ListaMusicasActivity.this, DetalheMusicasActivity.class);
                startActivity(i);*/


                Toast.makeText(getApplicationContext(),musicaClicada.getNome()+" - "+musicaClicada.getArtista(), Toast.LENGTH_SHORT).show();
            }
        });

        /*listviewMusicas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Musicas musicaClicada = listaMusicas.get(position);

                Intent i = new Intent(ListaMusicasActivity.this, DetalheMusicasActivity.class);
                startActivity(i);


                Toast.makeText(getApplicationContext(),musicaClicada.getNome()+" - "+musicaClicada.getArtista(), Toast.LENGTH_SHORT).show();

            }
        });*/


        listviewMusicas.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Musicas musicaClicada = listaMusicas.get(i);

                /*Intent i = new Intent(ListaMusicasActivity.this, DetalheMusicasActivity.class);
                startActivity(i);*/


                Toast.makeText(getApplicationContext(),musicaClicada.getNome()+" - "+musicaClicada.getArtista(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
