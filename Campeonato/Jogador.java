public class Jogador {

    private String nome;
    private String pisocao;
    private Integer idade;
    private Integer numeroCamisa;
    private int qtDpasse;
    private Integer qtdGols;
    private Integer qtdDeAssistencia;
    private Double peso;
    private Integer qtdDejogos;
    private String pePredominante;
    private Double altura;
    private Double qtdPercorridaEmcampo;
    private String nacionalidade;

    public Jogador(){

    }

    public Jogador(String nome,String posicao, int idade, int numeroCamisa, int qtDepasse, int qtdGols, int qtdDeAssistencia, 
    double peso, int qtdDejogos, String pePredominante, Double altura, Double qtdPercorridaEmcampo,String nacionalidade){

        this.nome= nome;
        this.pisocao=posicao;
        this.idade=idade;
        this.numeroCamisa=numeroCamisa;
        this.qtDpasse=qtDepasse;
        this.qtdGols=qtdGols;
        this.qtdDeAssistencia=qtdDeAssistencia;
        this.peso=peso;
        this.qtdDejogos=qtdDejogos;
        this.pePredominante=pePredominante;
        this.altura=altura;
        this.qtdPercorridaEmcampo=qtdPercorridaEmcampo;
        this.nacionalidade=nacionalidade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getPosicao(){
        return this.pisocao;
    }
    public int getIdade(){
        return this.idade;
    }
    public int getNumerocamisa(){
        return this.numeroCamisa;
    }
    public int getPasse(){
        return this.qtDpasse;
    }
    
    public int getGoals(){
        return this.qtdGols;
    }
    public int getAssistencia(){
        return this.qtdDeAssistencia;
    }
    public Double getPeso(){
        return this.peso;
    }

    public int getJogos(){
        return this.qtdDejogos;
    }
    public String getPepredominante(){
        return this.pePredominante;
    }
    public Double getAltura(){
        return this.altura;
    }
    public Double getKm(){
        return this.qtdPercorridaEmcampo;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
/// setters

    public void setMacionalidade(String nacional){
        this.nacionalidade=nacional;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setPosicao(String posicao){
        this.pisocao=posicao;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setcamisa(int camisa){
        this.numeroCamisa=camisa;
    }
    public void setPasse(int passe){
        this.qtDpasse=passe;
    }

    public void setGolas(int goals){
        this.qtdGols=goals;
    }
    public void setAssistencia(int assistencia){
        this.qtdDeAssistencia=assistencia;
    }
    public void setPeso(Double peso){
        this.peso=peso;
    }
    public void setJogos(int jogos){
         this.qtdDejogos=jogos;
    }
    public void setPepredominante(String pe){
        this.pePredominante=pe;
    }
    public void setAltura(Double altura){
        this.altura=altura;
    }
    public void setKm(Double km){
        this.qtdPercorridaEmcampo=km;
    }
}