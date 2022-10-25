package br.com.fatec.services;

import br.com.fatec.entities.Funcionario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    private int idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;


    public int getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(int idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistroPonto(String nomeFuncionario) {
        System.out.println("\n========================");
        System.out.println("Funcionario: " + nomeFuncionario);
        System.out.println("Data de Registro: " + this.getDataRegistro());
        System.out.println("Horario entrada: " + this.getHoraEntrada());
        System.out.println("Horario saida: " + this.getHoraSaida()+ "\n");
    }
}
