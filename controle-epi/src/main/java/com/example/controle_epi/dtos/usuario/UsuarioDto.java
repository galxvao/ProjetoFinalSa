package com.example.controle_epi.dtos.usuario;

public class UsuarioDto {

    private String nome;

    private String email;

    private String senha;

    public UsuarioDto(String nome, String login, String senha) {
        this.nome = nome;
        this.email = login;
        this.senha = senha;
    }

    public UsuarioDto() {
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
}
