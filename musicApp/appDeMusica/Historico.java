package app_de_musica;

import app_de_musica.Playlist;
import app_de_musica.Album;
import app_de_musica.Cantor;
import app_de_musica.Musica;
import app_de_musica.Banda;

public class Historico {
    private Playlist play;
    private Album album;
    private Cantor cantor;
    private Musica musica;
    private Banda banda;

    public Historico() {
    }

    public Historico(Album album, Banda banda, Cantor cantor, Musica musica, Playlist play) {
        this.album = album;
        this.banda = banda;
        this.cantor = cantor;
        this.musica = musica;
        this.play = play;
    }

    public Playlist getPlay() {
        return play;
    }

    public void setPlay(Playlist play) {
        this.play = play;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }



}
