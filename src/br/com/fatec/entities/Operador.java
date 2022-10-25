package br.com.fatec.entities;

import java.time.LocalDateTime;

public class Operador extends Funcionario{

    private double valorHora;

    public Operador(String nomeFuncionario) {
        super(nomeFuncionario);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

}
