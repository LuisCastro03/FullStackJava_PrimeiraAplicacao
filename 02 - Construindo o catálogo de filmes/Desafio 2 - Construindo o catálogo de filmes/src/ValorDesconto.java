// Desafio 6

public class ValorDesconto {
    public static void main(String[] args) {
        System.out.println("Hello, World...");

        System.out.println("---");

        double precoOriginal = 7.42;
        double percentualDesconto = 10.0;

        double valorDesconto = (percentualDesconto / 100) * precoOriginal;

        double novoPreco = precoOriginal - valorDesconto;

        System.out.println(String.format("O novo preço com desconto é R$ %.2f.", novoPreco));
    }
}
