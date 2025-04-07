
public class Arbitro {

    private Integer partidas;
    private Integer idade;
    private Double peso;
    private String nome;
    private String nacionalidade;
    private String federacao;
    private Boolean fifa;
    private Boolean trabalhaFora;
    private String emprego;
    private Jogador jogador;
    private Partida partida;
    private Cartoes cartoes;
    private Time time;
    private Estadio estadio;

    public Arbitro() {

    }

    public Arbitro(Integer partidas, Integer idade, Double peso, String nacionalidade,
            String federacao, Boolean fifa, Boolean trabalhaFora, String emprego, String nome) {

        this.partidas = partidas;
        this.idade = idade;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.federacao = federacao;
        this.fifa = fifa;
        this.trabalhaFora = trabalhaFora;
        this.emprego = emprego;
        this.nome = nome;
    }

    public String dadosSumula() {

        return "Árbitro: " + this.nome + " Idade: " + this.idade + " é fifa? " + this.fifa + " localizacao " + this.estadio.getLocalizacao() + " data da partida "
                + this.partida.getAno() + " mes " + this.partida.getMes() + " dia " + this.partida.getDia() + " horario " + this.partida.getHorario() + " times infracionados "
                + this.time.getNome() + " cartoes vermelhos " + this.cartoes.getVermelho() + " cartoes amarelo " + this.cartoes.getAmarelo() + " jogador " + this.jogador.getNome()
                + " numero " + this.jogador.getNumerocamisa();
    }

    // Getters and Setters
    public Integer getPartidas() {
        return this.partidas;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Double getPeso() {
        return this.peso;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String getfederacao() {
        return this.federacao;
    }

    public Boolean getFifa() {
        return this.fifa;
    }

    public Boolean getTrabalho() {
        return this.trabalhaFora;
    }

    public String getEmprego() {
        return this.emprego;
    }

    public String getNome() {
        return this.nome;
    }

    ///setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartidas(Integer jogos) {
        this.partidas = jogos;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setfederacao(String federacao) {
        this.federacao = federacao;
    }

    public void setFifa(Boolean fifa) {
        this.fifa = fifa;
    }

    public void setTrabalho(Boolean trabalha) {
        this.trabalhaFora = trabalha;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

}
