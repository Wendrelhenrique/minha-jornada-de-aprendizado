package app_de_musica;


import AppDeMusica.Banda;
import AppDeMusica.Cantor;
import AppDeMusica.Genero;
import AppDeMusica.Instrumentista;
import AppDeMusica.Vocalista;

public class Musica{
    private String nome;
    private double duracao;
    private Cantor cantor;
    private String letra;
    private Genero genero;
    private Banda banda;
    private Vocalista vocalista;
    private Instrumentista instrumentista;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Musica(){}

    public Musica(double duracao,String letra,String nome,String data){
        this.duracao = duracao;
        this.letra = letra;
        this.nome=nome;
    }

    public double getduracao(){
        return this.duracao;
    }

    public String getletra(){
        return this.letra;
    }
    public String getnome(String nome){
        this.nome = nome;
    }

    public void setduracao(double duracao){
        this.duracao = duracao;
    }

    public void setletra(String letra){
        this.letra = letra;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

}