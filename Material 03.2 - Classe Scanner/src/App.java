public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World...");
    }
}

/*

                        Classe Scanner

A classe Scanner é utilizada para ler a entrada de dados do usuário
no console. Ela faz parte do pacote java.util e oferece métodos
para ler diferentes tipos de dados, como strings, inteiros, e
números de ponto flutuante.

Exemplo de uso da classe Scanner:

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}

scanner.close(); é utilizado para fechar o scanner e liberar os
recursos associados a ele.

*/