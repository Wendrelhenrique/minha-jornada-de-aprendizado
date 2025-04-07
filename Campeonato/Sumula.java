
public class Sumula {
    private String descricao;
    private Arbitro arbitro; 

    public Sumula (String descricao, Arbitro arbitro){
        this.descricao = descricao;
        this.arbitro = arbitro;
    }

    public void registarConteudo(){

        String dadosArbitro = this.arbitro.dadosSumula();
    }
}
