// Desafio 5

public class ConversaoValor {
    public static void main(String[] args) {
        System.out.println("Hello, World...");

        System.out.println("---");

        double valorEmDolares = 99.90;
        double valorEmReais = 4.94;
        
        double valorConvertido = valorEmDolares * valorEmReais;

        System.out.println(String.format("O valor em reais é R$ %.2f.", valorConvertido));
    }
}
