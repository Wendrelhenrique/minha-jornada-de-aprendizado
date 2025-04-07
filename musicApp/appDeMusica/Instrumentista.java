package app_de_musica;

public class Instrumentista {
    private String intrumento;
    private Banda banda;
    private Cantor cantor;

    public Instrumentista() {
    }

    public Instrumentista(Banda banda, Cantor cantor, String intrumento) {
        this.banda = banda;
        this.cantor = cantor;
        this.intrumento = intrumento;
    }

    public String getIntrumento() {
        return intrumento;
    }

    public void setIntrumento(String intrumento) {
        this.intrumento = intrumento;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }
    
    
}
