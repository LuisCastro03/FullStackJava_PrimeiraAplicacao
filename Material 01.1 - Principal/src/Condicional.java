public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}

/*

                Alguns significados sobre o código

1. boolean incluidoNoPlano = true;

boolean: é um tipo de dado primitivo que pode armazenar
apenas dois valores: true (verdadeiro) ou false (falso);

incluidoNoPlano: é o nome da variável que armazena o valor
booleano;

true: é o valor booleano que indica que algo é verdadeiro.

2. if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

if: é uma estrutura condicional que permite executar
diferentes blocos de código com base em uma condição;

anoDeLancamento >= 2022: é a condição que está sendo
verificada. Ela compara o valor da variável anoDeLancamento.
Se for maior ou igual a 2022, imprime a primeira resposta,
senão, imprime a segunda resposta;

else: é uma parte opcional da estrutura condicional if. Ela
define um bloco de código que será executado quando a
condição do if for falsa.

3. if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

incluidoNoPlano == true: é a condição que está sendo
verificada. Ela compara o valor da variável incluidoNoPlano.
Se for igual a true, a condição é verdadeira, senão, é falsa;

&&: é o operador lógico "E" que exige que ambas as
condições sejam verdadeiras para que o bloco de código dentro
do if seja executado;

tipoPlano.equals("plus"): é um método que verifica se o
valor da variável tipoPlano é igual a "plus".

*/