public class Cartoes{
    private Integer cartaoVermelho;
    private Integer cartaoAmarelo;
    private Integer registraCartao;

    public Cartoes (Integer cartaoVermelho, Integer cartaoAmarelo){
        this.cartaoAmarelo=cartaoAmarelo;
        this.cartaoVermelho=cartaoVermelho;
    }

    public Integer getVermelho(){
        return this.cartaoVermelho;
    }

    public Integer getAmarelo(){
        return this.cartaoAmarelo;
    }

    // setters
    public void setVermelho(Integer vermelho){
        this.cartaoVermelho=vermelho;
    }

    public void setAmarelo(Integer amarelo){
        this.cartaoAmarelo=amarelo;
    }

public void falta(){
    getVermelho();
    getAmarelo();
}

}

