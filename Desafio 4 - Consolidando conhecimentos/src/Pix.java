import java.util.Scanner;

public class Pix {
    public static void main(String[] args){

        String nome = "Sofia Almeida Rossi";
        String tipoConta = "Corrente";
        double saldoConta = 400.00;
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);
        System.out.printf("""
                            ***********************
                            Dados iniciais do cliente:
                            
                            Nome: %s
                            Tipo conta: %s
                            Saldo inicial: R$ %.2f
                            ***********************
                            """, nome, tipoConta, saldoConta);

        while (opcao != 4) {
            System.out.print("""

                            Menu de operações:

                            1- Consultar saldos
                            2- Receber valor
                            3- Transferir valor
                            4- Sair

                            Digite a opção desejada:
                            """);

            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("");
                    System.out.printf("Seu saldo atual é de R$ %.2f", saldoConta);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Informe o valor a receber:");
                    double recebePix = leitura.nextDouble();
                    saldoConta += recebePix;
                    System.out.println("");
                    System.out.printf("Saldo atualizado: R$ %.2f", saldoConta);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Informe o valor que deseja transferir:");
                    double enviaPix = leitura.nextDouble();

                    if (enviaPix <= saldoConta) {
                        saldoConta -= enviaPix;
                        System.out.println("");
                        System.out.printf("Saldo atualizado: R$ %.2f", saldoConta);
                        System.out.println("");
                    } else {
                        System.out.println("");
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Operação encerrada.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}