package musicApp.appDeMusica;

public class Album {
    private Cantor cantor;
    private Musica musica;
    private Banda banda;
    private Vocalista vocalista;


    public Album() {
    }

    public Album(Banda banda, Cantor cantor, Musica musica, Vocalista vocalista) {
        this.banda = banda;
        this.cantor = cantor;
        this.musica = musica;
        this.vocalista = vocalista;
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

    public Vocalista getVocalista() {
        return vocalista;
    }

    public void setVocalista(Vocalista vocalista) {
        this.vocalista = vocalista;
    }


}
