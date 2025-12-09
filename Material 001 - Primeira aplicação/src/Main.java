public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
    }
}

/*

                       Algumas significados sobre o código

public class Main

public: é um modificador de acesso que define a visibilidade de algo. No caso,
deixando a classe pública para outras partes do projeto poder acessar;

class: é uma palavra-chave que indica que estamos criando uma classe
(como uma receita de bolo) que é igual para todos, mas o que contém dentro dele pode
variar (como o sabor, adicionais). O que pode variar são chamados de "objetos";

Main: é o nome da classe;

Chaves {}: Servem para delimitar um bloco de código, agrupar um conjunto de instruções,
etc, para determinar onde começa e termina o bloco, para deixá-lo mais organizado;

O "public class Main" juntos declaram uma classe que é acessível em qualquer parte do
projeto.

-------------------------------------------------------------------------------------

public static void main(String[] args) {

static: Serve para tornar um método/variável estática na classe inteira, fazendo com
que não precise chamá-los criando um objeto;

void: Indica que o método onde está inserido não retorna nenhum valor;

main: É o nome do método, como uma porta de entrada para acessar o que contém nele;

(String[] args): Ele permite passar argumentos ao programa;

-------------------------------------------------------------------------------------

System.out.println()

System: É uma classe padrão do Java que fornece acesso a funcionalidades do sistema;

out: É um objeto estático dentro da classe System (PrintStream) que representa a saída
padrão (geralmente o console);

println: É um método do objeto out que imprime uma linha de texto no console;

(): Os parênteses são usados para passar argumentos para o método. No caso do println,
o argumento é o texto ou valor que queremos imprimir.

*/