public class Partida {
    
    private String dia;
    private String horario;
    private String local;
    private String mes;
    private String ano;

    public Partida (){

    }

    public Partida ( String dia,String horario,String local,String mes,String ano ){
     this.dia=dia;
     this.horario=horario;
     this.local=local;
     this.mes=mes;
     this.ano=ano;
    }

    public String getDia(){
        return this.dia;
    }
    public String getHorario(){
        return this.horario;
    }
    public String getLoca(){
        return this.local;
    }
    public String getMes(){
        return this.mes;
    }
    public String getAno(){
        return this.ano;
    }
    ///setters
    public void setDia(String dia){
        this.dia=dia;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setLoca(String local){
        this.local=local;
    }
    public void getMes(String mes){
        this.mes=mes;
    }
    public void getAno(String ano){
         this.ano=ano;
    }

}
