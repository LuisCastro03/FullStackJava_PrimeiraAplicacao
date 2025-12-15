import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + avaliacao);
    }
}

/*

                Alguns significados sobre o código

1. import java.util.Scanner;

import: é uma palavra-chave usada para importar classes de outros
pacotes, permitindo o uso de funcionalidades pré-definidas no
código;

java.util.Scanner: é o caminho completo (pacote e classe) da
classe Scanner, que é usada para ler a entrada do usuário.

2. Scanner leitura = new Scanner(System.in);

Scanner: é o tipo da variável, que representa a classe Scanner
usada para ler a entrada do usuário;

leitura: é o nome da variável que armazena a instância do
Scanner;

new Scanner(System.in): cria uma nova instância da classe
Scanner, configurada para ler a entrada padrão (teclado).

3. String filme = leitura.nextLine();

String: é o tipo da variável, que representa uma sequência de
caracteres (texto);

filme: é o nome da variável que armazena o nome do filme
favorito do usuário;

leitura.nextLine(): chama o método nextLine() do objeto leitura,
que lê uma linha completa de texto digitada pelo usuário.

4. int anoDeLancamento = leitura.nextInt();

int: é o tipo da variável, que representa um número inteiro;

anoDeLancamento: é o nome da variável que armazena o ano de
lançamento do filme;

leitura.nextInt(): chama o método nextInt() do objeto leitura,
que lê um número inteiro digitado pelo usuário.

5. double avaliacao = leitura.nextDouble();

double: é o tipo da variável, que representa um número de
ponto flutuante (número com casas decimais);

avaliacao: é o nome da variável que armazena a avaliação do
filme;

leitura.nextDouble(): chama o método nextDouble() do objeto
leitura, que lê um número decimal digitado pelo usuário.

*/