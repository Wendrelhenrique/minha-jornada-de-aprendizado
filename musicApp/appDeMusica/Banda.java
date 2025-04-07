package app_de_musica;

public class Banda {
    private String nome;
    private String formacao;
    private String estilo;
    private int anoCriacao;


    public Banda() {
    }

    
    public Banda(int anoCriacao, String estilo, String formacao, String nome) {
        this.anoCriacao = anoCriacao;
        this.estilo = estilo;
        this.formacao = formacao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    

}
