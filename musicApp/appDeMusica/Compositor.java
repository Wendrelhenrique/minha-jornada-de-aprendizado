package app_de_musica;

public class Compositor {
    private Banda banda;
    private Cantor cantor;
    private Genero genero;
    private String nome;

    public Compositor() {
    }

    public Compositor(Banda banda, Cantor cantor, Genero genero, String nome) {
        this.banda = banda;
        this.cantor = cantor;
        this.genero = genero;
        this.nome = nome;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
