// Desafio 1

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World...");

        System.out.println("");

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Número negativo.");
        }

        //Desafio 2

        System.out.println("");

        System.out.print("Digite um número: ");
        int numero1 = leitura.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais.");
        } else if (numero1 > numero2) {
            System.out.println("Números diferentes e " + numero1 + " é maior.");
        } else {
            System.out.println("Números diferentes e " + numero2 + " é maior.");
        }

        //Desafio 3

        System.out.println("");

        System.out.print("""
                        Digite um número correspondente a opção:
                         1 - Calcular área do quadrado
                         2 - Calcular área do círculo
                         """);
        int escolha = leitura.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = leitura.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println(String.format("A área do quadrado é %.2f.", areaQuadrado));
        } else if (escolha == 2) {
            System.out.print("Digite o valor do raio do círculo: ");
            double raio = leitura.nextDouble();
            double areaCirculo = Math.PI * raio * raio;
            System.out.println(String.format("A área do círculo é %.2f.", areaCirculo));
        } else {
            System.out.println("Opção inválida.");
        }

        //Desafio 4

        System.out.println("");

        System.out.print("Digite um número: ");
        int numeroTabuada = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        //Desafio 5

        System.out.println("");

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = leitura.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        //Desafio 6

        System.out.println("");

        System.out.print("Digite um número: ");
        int numeroFatorial = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numeroFatorial; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numeroFatorial + " é " + fatorial + ".");
    }
}