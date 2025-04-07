package app_de_musica;

public class Vocalista {
    private Banda banda;
    private Historico historico;
    private Instrumentista instrumentista;
    private Cantor cantor;
    private Playlist playlist;

    public Vocalista() {
    }

    public Vocalista(Banda banda, Cantor cantor, Historico historico, Instrumentista instrumentista, Playlist playlist) {
        this.banda = banda;
        this.cantor = cantor;
        this.historico = historico;
        this.instrumentista = instrumentista;
        this.playlist = playlist;
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

    public Instrumentista getInstrumentista() {
        return instrumentista;
    }

    public void setInstrumentista(Instrumentista instrumentista) {
        this.instrumentista = instrumentista;
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



}
