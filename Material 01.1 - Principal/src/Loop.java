import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao / 3);

    }
}

/*

                Alguns significados sobre o código

1. for (int i = 0; i < 3; i++) {

for: é uma estrutura de controle de fluxo que permite repetir
um bloco de código um número específico de vezes;

int i = 0: inicializa a variável de controle i com o valor 0,
que será usada para contar o número de iterações;

i < 3: é a condição que determina quantas vezes o loop será
executado. Enquanto i for menor que 3, o loop continuará;

i++: incrementa o valor de i em 1 a cada iteração do loop.

2. mediaAvaliacao += nota;

mediaAvaliacao += nota; é uma forma abreviada de escrever
mediaAvaliacao = mediaAvaliacao + nota; que acumula o valor de
nota na variável mediaAvaliacao a cada iteração do loop.

+= é um operador de atribuição composto que adiciona o valor
à variável existente.

*/