package appDeMusica;
public class Cantor {
    private String nome;
    private Genero genero;
    private Instrumentista instrumentista;
    private Playlist playlist;
    private Vocalista vocalista;
    private Banda banda;

    public Cantor(){}

    

    public Cantor(String nome, Genero genero, Instrumentista instrumentista, Playlist playlist, Vocalista vocalista,
            Banda banda) {
        this.nome = nome;
        this.genero = genero;
        this.instrumentista = instrumentista;
        this.playlist = playlist;
        this.vocalista = vocalista;
        this.banda = banda;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Instrumentista getInstrumentista() {
        return instrumentista;
    }

    public void setInstrumentista(Instrumentista instrumentista) {
        this.instrumentista = instrumentista;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
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
