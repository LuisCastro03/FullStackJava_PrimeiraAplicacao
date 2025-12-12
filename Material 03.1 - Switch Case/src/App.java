public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World...");
    }
}

/*

                        Switch Case

É uma estrutura condicional que permite executar diferentes partes
do código com base no valor de uma variável ou expressão. É uma
alternativa ao uso de múltiplos "if-else if" quando se tem várias
condições a serem verificadas.

Sintaxe básica:
switch (expressão) {
   case valor1:
      // código a ser executado se a expressão for igual a valor1
      break;
   case valor2:
      // código a ser executado se a expressão for igual a valor2
      break;
   case valor3:
      // código a ser executado se a expressão for igual a valor3
      break;
   ...
   default:
      // código a ser executado se a expressão não for igual a
      // nenhum valor
      break;
}

switch: é avaliado uma vez e o valor da expressão é comparado
com os valores em cada case. Se houver uma correspondência, o
código associado a esse case é executado até encontrar um break,
que encerra o switch. Se nenhum case corresponder, o código no
default é executado;

expressão: pode ser uma variável ou qualquer expressão que retorne
um valor compatível com os tipos permitidos (como int, char,
String, etc.);

case valorX: representa cada possível valor que a expressão pode
assumir. Se a expressão corresponder a esse valor, o código
associado a esse case é executado até encontrar um break, que
encerra o switch;

default: é opcional e é executado se nenhum dos cases corresponder
ao valor da expressão. Funciona como o "else" em uma estrutura
if-else.

Exemplo:
int dia = 3;
String nomeDia;

switch (dia) {
   case 1:
      nomeDia = "domingo";
      break;
   case 2:
      nomeDia = "segunda-feira";
      break;
   case 3:
      nomeDia = "terça-feira";
      break;
   case 4:
      nomeDia = "quarta-feira";
      break;
   case 5:
      nomeDia = "quinta-feira";
      break;
   case 6:
      nomeDia = "sexta-feira";
      break;
   case 7:
      nomeDia = "sábado";
      break;
   default:
      nomeDia = "Dia inválido";
      break;
}

System.out.println("O dia " + dia + " é " + nomeDia);

Nesse exemplo, a expressão é a variável dia, que contém o valor 3.
O switch case verifica o valor da variável dia e executa o código
correspondente ao caso em que dia é igual a 3. O resultado será a
impressão no console: "O dia 3 é terça-feira".

                    Vantagens do switch case:

Em resumo, o switch case torna o código mais fácil de entender e
mais legível, em comparação ao if/else, especialmente quando há
várias condições possíveis.

*/