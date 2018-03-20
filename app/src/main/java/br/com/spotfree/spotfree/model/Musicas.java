package br.com.spotfree.spotfree.model;

import java.io.Serializable;

/**
 * Created by re_ja on 15/03/2018.
 */

public class Musicas implements Serializable{

    private long id;
    private String nome;
    private String artista;
    private String duracao;
    private String imagem;
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Musicas musicas = (Musicas) o;

        if (!nome.equals(musicas.nome)) return false;
        if (!artista.equals(musicas.artista)) return false;
        if (!duracao.equals(musicas.duracao)) return false;
        return imagem.equals(musicas.imagem);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + artista.hashCode();
        result = 31 * result + duracao.hashCode();
        result = 31 * result + imagem.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Musicas{" +
                "nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", duracao=" + duracao +
                ", imagem='" + imagem + '\'' +
                '}';
    }

}
