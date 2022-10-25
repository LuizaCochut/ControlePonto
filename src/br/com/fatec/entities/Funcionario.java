package br.com.fatec.entities;

import br.com.fatec.services.RegistroPonto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Funcionario {

    RegistroPonto registroPonto = new RegistroPonto();
    private String nomeFuncionario;

    public Funcionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void registrarPonto() {
        if (registroPonto.getHoraEntrada() == null) {
            registroPonto.setDataRegistro(LocalDate.now());
            registroPonto.setHoraEntrada(LocalDateTime.now());
        }
        else {
            registroPonto.setHoraSaida(LocalDateTime.now());
        }

        registroPonto.apresentarRegistroPonto(this.nomeFuncionario);
    }

}
