public class Time {
    private Integer qtdPartidaAno;
    private Integer qtdJogadores;
    private Integer comisaoTecnica;
    private Integer equipeMedica;
    private Integer qtdTitulos;
    private Integer qtdRebaixamento;
    private String nome;
    private Boolean ctDetreinamento;
    private Integer funcionarios;

    
    public Time(){

    }

    public Time( Integer qtdPartidaAno, Integer qtdJogadores,Integer comisaoTecnica,Integer equipeMedica,Integer qtdTitulos,Integer qtdRebaixamento,
    String nome,Boolean ctDetreinamento,Integer funcionarios){
         
        this.qtdPartidaAno=qtdPartidaAno;
        this.qtdJogadores=qtdJogadores;
        this.comisaoTecnica=comisaoTecnica;
        this.equipeMedica=equipeMedica;
        this.qtdTitulos=qtdTitulos;
        this.qtdRebaixamento=qtdRebaixamento;
        this.nome=nome;
        this.ctDetreinamento=ctDetreinamento;
        this.funcionarios=funcionarios;
    }

    public Integer getPartida(){
        return this.qtdPartidaAno;
    }
    public Integer getJogador(){
        return this.qtdJogadores;
    }
    public Integer getComissaoTecnica(){
        return this.comisaoTecnica;
    }
    public Integer getMedica(){
        return this.equipeMedica;
    }
    public Integer getTitulos(){
        return this.qtdTitulos;
    }
    public Integer getRebaixamento(){
        return this.qtdRebaixamento;
    }
    public String getNome(){
        return this.nome;
    }
    public Boolean getCtTreinamento(){
        return this.ctDetreinamento;
    }
    public Integer getFuncionarios(){
        return this.funcionarios;
    }
    //// setters

    public void setPartida(Integer partida){
        this.qtdPartidaAno=partida;
    }
    public void setJogador(Integer jogador){
        this.qtdJogadores=jogador;
    }
    public void setComissaoTecnica(Integer tecnica){
         this.comisaoTecnica=tecnica;
    }
    public void setMedica(Integer medica){
        this.equipeMedica=medica;
    }
    public void setTitulos(Integer titulos){
         this.qtdTitulos=titulos;
    }
    public void setRebaixamento(Integer rebaixamento){
        this.qtdRebaixamento=rebaixamento;
    }
    public void setNome(String nome){
         this.nome=nome;
    }
    public void setCtTreinamento(Boolean ctTreinamento){
        this.ctDetreinamento=ctTreinamento;
    }
    public void setFuncionarios(Integer funcionarios){
         this.funcionarios=funcionarios;
    }
}
