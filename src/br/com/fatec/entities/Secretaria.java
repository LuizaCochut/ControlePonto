package br.com.fatec.entities;

import br.com.fatec.services.RegistroPonto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Secretaria extends Funcionario{

    private String telefone;
    private String ramal;

    public Secretaria(String nomeFuncionario) {
        super(nomeFuncionario);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

}
