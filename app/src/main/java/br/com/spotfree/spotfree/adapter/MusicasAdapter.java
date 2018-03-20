package br.com.spotfree.spotfree.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.com.spotfree.spotfree.R;
import br.com.spotfree.spotfree.model.Musicas;

/**
 * Created by re_ja on 15/03/2018.
 */

public class MusicasAdapter extends BaseAdapter{

    private List<Musicas> listaMusicas;
    private Activity raiz;

    public MusicasAdapter(Activity raiz, List<Musicas> listaMusicas) {
        this.listaMusicas = listaMusicas;
        this.raiz = raiz;
    }

    @Override
    public int getCount() {
        return listaMusicas.size();
    }

    @Override
    public Object getItem(int position) {
        return listaMusicas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaMusicas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = raiz.getLayoutInflater().inflate(R.layout.item_lista_musicas, parent, false);

        Musicas current = listaMusicas.get(position);

        TextView nomeDaMusica = v.findViewById(R.id.textViewNomeDaMusicaListaMusicas);
        TextView nomeDoArtista = v.findViewById(R.id.textViewNomeDoArtistaListaMusicas);
        ImageView imagemAlbum = v.findViewById(R.id.imageViewImagemListaMusicas);

        nomeDaMusica.setText(current.getNome());
        nomeDoArtista.setText(current.getArtista());

        if (current.getTag().equals("aero"))
            imagemAlbum.setImageResource(R.drawable.aerosmith);
        else if (current.getTag().equals("ff"))
            imagemAlbum.setImageResource(R.drawable.foofighters);
        else if (current.getTag().equals("lp"))
            imagemAlbum.setImageResource(R.drawable.linkinpark);
        else if (current.getTag().equals("gnr"))
            imagemAlbum.setImageResource(R.drawable.gunsnroses);

        return v;
    }
}
