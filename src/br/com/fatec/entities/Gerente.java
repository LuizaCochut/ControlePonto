package br.com.fatec.entities;

import java.time.LocalDateTime;

public class Gerente extends Funcionario{

    private String login;
    private String senha;

    public Gerente(String nomeFuncionario) {
        super(nomeFuncionario);
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
