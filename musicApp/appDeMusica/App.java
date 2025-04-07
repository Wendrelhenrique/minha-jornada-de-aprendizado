package app_de_musica;

import appDeMusica.Cantor;
import appDeMusica.Genero;
import app_de_musica.Banda;
import app_de_musica.Historico;
import app_de_musica.Musica;
import app_de_musica.Playlist;
import app_de_musica.Usuario;

public class App {
    private Album album;
    private Banda banda;
    private Usuario usuario;
    private Cantor cantor;
    private Playlist playlist;
    private Musica musica;
    private Genero genero;
    private Historico historico;
    private String nome;
    private String estetica;

    public App(){
        
    }

    public App(Album album, musicApp.appDeMusica.Banda banda, musicApp.appDeMusica.Usuario usuario,
            musicApp.appDeMusica.Cantor cantor, musicApp.appDeMusica.Playlist playlist,
            musicApp.appDeMusica.Musica musica, musicApp.appDeMusica.Genero genero,
            musicApp.appDeMusica.Historico historico, String nome, String estetica) {
        this.album = album;
        this.banda = banda;
        this.usuario = usuario;
        this.cantor = cantor;
        this.playlist = playlist;
        this.musica = musica;
        this.genero = genero;
        this.historico = historico;
        this.nome = nome;
        this.estetica = estetica;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstetica() {
        return estetica;
    }

    public void setEstetica(String estetica) {
        this.estetica = estetica;
    }
    
    
}
