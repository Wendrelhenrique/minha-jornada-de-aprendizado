package app_de_musica;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataDeNascimento;
    private String telefone;

    public Usuario(String nome, String email, String senha, LocalDate dataDeNascimento, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int calcularIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + calcularIdade() + " anos");
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
