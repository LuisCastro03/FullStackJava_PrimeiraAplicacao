public class Programa {
    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
            contador++; //Sem isso, o código entraria em loop infinito
        }
    }
}

/*

                Alguns significados sobre o código

while (contador <= 10) {

while: é uma estrutura de repetição que executa um bloco de código
enquanto uma condição for verdadeira.

(contador <= 10);: é a condição que está sendo verificada.
Enquanto o valor da variável contador for menor ou igual a 10, o
bloco de código dentro do while será executado repetidamente.

contador++: é uma forma abreviada de escrever contador = contador
+ 1. Isso incrementa o valor da variável contador em 1 a cada
iteração do loop.

*/