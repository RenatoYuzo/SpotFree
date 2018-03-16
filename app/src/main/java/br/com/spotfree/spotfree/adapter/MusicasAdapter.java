package br.com.spotfree.spotfree.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

        TextView nomeDaMusica = v.findViewById(R.id.textViewNomeDaMusicaListaMusicas);
        TextView nomeDoArtista = v.findViewById(R.id.textViewNomeDoArtistaListaMusicas);

        nomeDaMusica.setText(listaMusicas.get(position).getNome());
        nomeDoArtista.setText(listaMusicas.get(position).getArtista());

        return v;
    }
}
