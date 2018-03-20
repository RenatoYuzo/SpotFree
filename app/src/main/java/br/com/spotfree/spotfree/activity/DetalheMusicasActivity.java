package br.com.spotfree.spotfree.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.spotfree.spotfree.R;
import br.com.spotfree.spotfree.model.Musicas;

/**
 * Created by re_ja on 15/03/2018.
 */

public class DetalheMusicasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhe_musicas);

        Musicas currentMusic = (Musicas) getIntent().getSerializableExtra("musicaClicada");

        TextView textViewDuracao = findViewById(R.id.textViewDuracaoDetalheMusicas);
        TextView textViewNome = findViewById(R.id.textViewNomeDaMusicaDetalheMusicas);
        TextView textViewArtista = findViewById(R.id.textViewNomeDoArtistaDetalheMusicas);
        ImageView imageViewAlbum = findViewById(R.id.imageViewAlbumDetalheMusicas);

        textViewDuracao.setText("Duração: "+currentMusic.getDuracao());
        textViewNome.setText(currentMusic.getNome());
        textViewArtista.setText(currentMusic.getArtista());

        if (currentMusic.getTag().equals("aero"))
            imageViewAlbum.setImageResource(R.drawable.aerosmith);
        else if (currentMusic.getTag().equals("ff"))
            imageViewAlbum.setImageResource(R.drawable.foofighters);
        else if (currentMusic.getTag().equals("lp"))
            imageViewAlbum.setImageResource(R.drawable.linkinpark);
        else if (currentMusic.getTag().equals("gnr"))
            imageViewAlbum.setImageResource(R.drawable.gunsnroses);
    }
}
