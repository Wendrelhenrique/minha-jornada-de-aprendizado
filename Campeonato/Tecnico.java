public class Tecnico {
    private Integer idade;
    private Integer vitorias;
    private Integer jogos;
    private Integer trofeus;
    private String nome;

    public Tecnico(){

    }

    public Tecnico(Integer idade,Integer vitorias,Integer jogos,Integer trofeus,String nome){
     this.idade=idade;
     this.vitorias=vitorias;
     this.jogos=jogos;
     this.trofeus=trofeus;
     this.nome=nome;
    }

    public Integer getIdade(){
        return this.idade;
    }
    public Integer getVitorias(){
        return this.vitorias;
    }
    public Integer getJogos(){
        return this.jogos;
    }
    public Integer getTrofeus(){
        return this.trofeus;
    }
    public String getNome(){
        return this.nome;
    }
    //setters
    public void setIdade(Integer idade){
        this.idade=idade;
    }
    public void setVitorias(Integer vitorias){
        this.vitorias=vitorias;
    }
    public void setJogos(Integer jogos){
        this.jogos=jogos;
    }
    public void setTrofeus(Integer trofeus){
        this.trofeus=trofeus;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
}
