public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World...");

        int temperaturaCelsius = 20;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        int FahrenheitInt = (int) temperaturaFahrenheit;

        System.out.println(FahrenheitInt);

    }
}

/*

            Algumas observações sobre o código

Para fazer o casting de valores em Java, usamos o tipo de dado
entre parênteses antes do valor a ser convertido. No exemplo
acima, convertemos um valor do tipo double para int usando
(int) antes da variável temperaturaFahrenheit.

Escrevendo com minhas palavras, preciso criar uma variável
diferente para quando eu quiser fazer o casting

*/