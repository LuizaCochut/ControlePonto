package br.com.fatec;

import br.com.fatec.entities.Gerente;
import br.com.fatec.entities.Operador;
import br.com.fatec.entities.Secretaria;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Gerente gerente = new Gerente("Gerente Joao");
        Secretaria secretaria = new Secretaria("Secretaria Maria");
        Operador operador = new Operador("Operador Ze");

        gerente.registrarPonto();
        Thread.sleep(1000);
        operador.registrarPonto();
        Thread.sleep(1000);
        secretaria.registrarPonto();
        Thread.sleep(1000);
        gerente.registrarPonto();
        Thread.sleep(1000);
        operador.registrarPonto();
        Thread.sleep(1000);
        secretaria.registrarPonto();
        Thread.sleep(1000);

    }
}
