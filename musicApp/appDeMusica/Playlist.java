package app_de_musica;

public class Playlist {
    private Musica musica;
    private Genero genero;
    private Banda banda;
    private Historico historico;

    public Playlist(){

    }

    public Playlist(Banda banda, Genero genero, Historico historico, Musica musica) {
        this.banda = banda;
        this.genero = genero;
        this.historico = historico;
        this.musica = musica;
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

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    
}