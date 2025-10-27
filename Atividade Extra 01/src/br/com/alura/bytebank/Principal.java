package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println();

        System.out.println("Bem vindo ao bytebank");

        new Funcionario("João", 1, LocalDate.of(1990, 2, 12));
        System.out.println();
    }
}