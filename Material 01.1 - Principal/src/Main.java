public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média calculada pelas 3 notas de Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
                 
        System.out.println(sinopse);
    }
}

/*

                Alguns significados sobre o código

1. public class Main {

public: é um modificador de acesso que define a visibilidade
de algo. No caso, deixando a classe pública para outras partes
do projeto poder acessar;

class: é uma palavra-chave que indica que estamos criando uma
classe (como uma receita de bolo) que é igual para todos, mas
o que contém dentro dele pode variar (como o sabor,
adicionais). O que pode variar são chamados de "objetos";

Main: é o nome da classe;

Chaves {}: Servem para delimitar um bloco de código, agrupar
um conjunto de instruções, etc, para determinar onde começa e
termina o bloco, para deixá-lo mais organizado;

O "public class Main" juntos declaram uma classe que é
acessível em qualquer parte do projeto.

--------------------------------------------------------------

2. public static void main(String[] args) {

static: Serve para tornar um método/variável estática na
classe inteira, fazendo com que não precise chamá-los criando
um objeto;

void: Indica que o método onde está inserido não retorna
nenhum valor;

main: É o nome do método, como uma porta de entrada para
acessar o que contém nele;

(String[] args): Ele permite passar argumentos ao programa;

--------------------------------------------------------------

3. System.out.println();

System: É uma classe padrão do Java que fornece acesso a
funcionalidades do sistema;

out: É um objeto estático dentro da classe System (PrintStream)
que representa a saída padrão (geralmente o console);

println: É um método do objeto out que imprime uma linha de
texto no console;

(): Os parênteses são usados para passar argumentos para o
método. No caso do println, o argumento é o texto ou valor que
queremos imprimir.

Ponto e vírgula ;: O ponto e vírgula é usado para indicar o fim de uma linha
de código em Java.

--------------------------------------------------------------

4. int anoDeLancamento = 2022;

int: É um tipo de dado primitivo em Java que representa
números inteiros;

anoDeLancamento: É o nome da variável que armazena o valor do
ano de lançamento do filme;
Obs: Variável pode ser qualquer nome que você queira dar,
desde que siga as regras de nomenclatura do Java;
Obs 2: A variável pode ser colocada entre os parênteses do
System.out.println() para imprimir o valor dela no console;
Obs 3: A variável pode ser adicionada com outros textos usando o
sinal de + para concatenar (juntar) os textos e valores;

Operador = : É o operador de atribuição que atribui o valor à variável;

2022: É o valor inteiro que está sendo atribuído à variável.

--------------------------------------------------------------

5. boolean incluidoNoPlano = true;

boolean: É um tipo de dado primitivo em Java que representa
valores lógicos, podendo ser verdadeiro (true) ou falso
(false);

incluidoNoPlano: Variável que armazena o valor booleano;

true: Valor booleano que indica que algo é verdadeiro.

--------------------------------------------------------------

6. double notaDoFilme = 8.1;

double: É um tipo de dado primitivo em Java que representa
números de ponto flutuante (números decimais);

notaDoFilme: Variável que armazena a nota do filme;

8.1: Valor decimal que está sendo atribuído à variável.

--------------------------------------------------------------

7. double media = (9.8 + 6.3 + 8.0) / 3;

double: Tipo de dado primitivo para números decimais;

media: Variável que armazena a média calculada;

(9.8 + 6.3 + 8.0) / 3: Expressão que calcula a média das
notas somando-as e dividindo pelo número de notas (3).

--------------------------------------------------------------

8. String sinopse;

String: É um tipo de dado em Java que representa uma sequência
de caracteres (texto);

sinopse: Variável que armazena a sinopse do filme.

--------------------------------------------------------------

9. sinopse = """ ... """ + anoDeLancamento;

""" ... """: É uma forma de declarar uma string multilinha em
Java, permitindo que o texto seja escrito em várias linhas sem
a necessidade de usar caracteres especiais para novas linhas;

*/