package appDeMusica;

import appDeMusica.Musica;
import appDeMusica.Album;
import appDeMusica.Banda;
import appDeMusica.Compositor;
import appDeMusica.Vocalista;

public class Genero {

    private Musica musica;
    private Compositor compositor;
    private Album album;
    private Vocalista vocalista;
    private Banda banda;

    public Genero() {

    }

    public Genero(Musica musica, Compositor compositor, Album album, Vocalista vocalista, Banda banda) {
        this.musica = musica;
        this.compositor = compositor;
        this.album = album;
        this.vocalista = vocalista;
        this.banda = banda;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Vocalista getVocalista() {
        return vocalista;
    }

    public void setVocalista(Vocalista vocalista) {
        this.vocalista = vocalista;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

}
