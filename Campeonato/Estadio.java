public class Estadio {
    
    private String localizacao;
    private double qtDepessoas;
    private String horario;
    private String gramado;
    private Integer qtDecadeiras;
    private Double ocupacaoMaxima;
    private Integer qtdCatracas;
    private Integer qtdSeguranca;
    private Integer qtdCamera;
    private Integer qtdBebedouro;
    private Integer qtdBanheiro;
    private Integer qtdVips;
    private Integer qtdFuncionarios;
    private Boolean dreno;
    private Boolean salaVar;
    private Boolean sistemaDedigital;
    private Boolean acessibilidade;
    private Integer qtdElevador;
    private String nome;
    
    public Estadio(){

    }

    public Estadio(  String localizacao,double qtDepessoas,String horario,String gramado,Integer qtDecadeiras,Double ocupacaoMaxima,Integer qtdCatracas,
    Integer qtdSeguranca,Integer qtdCamera,Integer qtdBebedouro,Integer qtdBanheiro,Integer qtdVips,Integer qtdFuncionarios,Boolean dreno,
    Boolean salaVar,Boolean sistemaDedigital,Boolean acessibilidade,Integer qtdElevador,String nome){

     this.localizacao=localizacao;
     this.qtDepessoas=qtDepessoas;
     this.horario=horario;
     this.gramado=gramado;
     this.qtDecadeiras=qtDecadeiras;
     this.ocupacaoMaxima=ocupacaoMaxima;
     this.qtdCatracas=qtdCatracas;
     this.qtdSeguranca=qtdSeguranca;
     this.qtdCamera=qtdCamera;
     this.qtdBebedouro=qtdBebedouro;
     this.qtdBanheiro=qtdBanheiro;
     this.qtdVips=qtdVips;
     this.qtdFuncionarios=qtdFuncionarios;
     this.dreno=dreno;
     this.salaVar=salaVar;
     this.sistemaDedigital=sistemaDedigital;
     this.acessibilidade=acessibilidade;
     this.qtdElevador=qtdElevador;
     this.nome=nome;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }
    public Double getPessoa(){
        return this.qtDepessoas;
    }
    public String getHorario(){
        return this.horario;
    }
    public String getGrama(){
        return this.gramado;
    }
    public int getCadeiras(){
        return this.qtDecadeiras;
    }
    public Double getOcupacaoMaxima(){
        return this.ocupacaoMaxima;
    }
    public int getCatracas(){
        return this.qtdCatracas;
    }
    public int getSeguranca(){
        return this.qtdSeguranca;
    }
    public int  getCameras(){
        return this.qtdCamera;
    }

    public int getBebedouro(){
        return this.qtdBebedouro;
    }
    public int getBanhoro(){
        return this.qtdBanheiro;
    }
    public int getVips(){
        return this.qtdVips;
    }
    public int getFuncionario(){
        return this.qtdFuncionarios;
    }

    public Boolean getDreno(){
        return this.dreno;
    }
    public Boolean getvar(){
        return this.salaVar;
    }
    public Boolean getIdentificador(){
        return this.sistemaDedigital;
    }
    public Boolean getAcessibilidade(){
        return this.acessibilidade;
    }
    public int getElevador(){
        return this.qtdElevador;
    }
    public String getNome(){
        return this.nome;
    }
    ///setters
    public void setNomes(String nome){
        this.nome=nome;
    }
    public void setLocalizacao(String localizacao){
         this.localizacao=localizacao;
    }
    public void setPessoa(Double pessoas){
        this.qtDepessoas=pessoas;
    }
    public void setHorario(String horas){
        this.horario=horas;
    }
    public void setGrama(String grama){
        this.gramado=grama;
    }
    public void setCadeiras(int cadeiras){
         this.qtDecadeiras=cadeiras;
    }
    public void setOcupacaoMaxima(double ocupacaoMaxima){
         this.ocupacaoMaxima=ocupacaoMaxima;
    }
    public void setCatracas(int catracas){
         this.qtdCatracas=catracas;
    }
    public void setSeguranca(int segurancas){
         this.qtdSeguranca=segurancas;
    }
    public void  setCameras(int cameras){
        this.qtdCamera=cameras;
    }

    public  void setBebedouro(int bebedor){
        this.qtdBebedouro=bebedor;
    }
    public void setBanheiro(int banheiro){
         this.qtdBanheiro=banheiro;
    }
    public void setVips(int vips){
         this.qtdVips=vips;
    }
    public void setFuncionario(int funcionario){
         this.qtdFuncionarios=funcionario;
    }

    public void setDreno(Boolean dreno){
        this.dreno=dreno;
    }
    public void setvar(Boolean var){
        this.salaVar=var;
    }
    public void setIdentificador(Boolean digital){
        this.sistemaDedigital=digital;
    }
    public void setAcessibilidade(Boolean acessibilidade){
         this.acessibilidade=acessibilidade;
    }
    public void setElevador(int elevador){
        this.qtdElevador=elevador;
    }
}
