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
        m1.setDuracao("4:59");
        m1.setTag("aero");

        Musicas m2 = new Musicas();
        m2.setArtista("Foo Fighters");
        m2.setNome("Learn To Fly");
        m2.setDuracao("3:55");
        m2.setTag("ff");

        Musicas m3 = new Musicas();
        m3.setArtista("Linkin Park");
        m3.setNome("In The End");
        m3.setDuracao("3:39");
        m3.setTag("lp");

        Musicas m4 = new Musicas();
        m4.setArtista("Guns N' Roses");
        m4.setNome("Sweet Child O' Mine");
        m4.setDuracao("5:56");
        m4.setTag("gnr");

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

                Intent intent = new Intent(ListaMusicasActivity.this, DetalheMusicasActivity.class);
                intent.putExtra("musicaClicada", musicaClicada);
                startActivity(intent);

            }
        });

    }
}
