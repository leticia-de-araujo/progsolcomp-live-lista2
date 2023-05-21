/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Vendas
Data: 21/05/2023
 */

import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorVenda, valorFinal;
        int opcaoPagamento;

        System.out.print("Digite o valor da venda: ");
        valorVenda = teclado.nextDouble();

        System.out.println("Escolha a opção de pagamento:");
        System.out.println("1 - Venda à vista (desconto de 10%)");
        System.out.println("2 - Venda a prazo 30 dias (desconto de 5%)");
        System.out.println("3 - Venda a prazo 60 dias (mesmo preço)");
        System.out.println("4 - Venda a prazo 90 dias (acréscimo de 5%)");
        System.out.println("5 - Venda com cartão de débito (desconto de 8%)");
        System.out.println("6 - Venda com cartão de crédito (desconto de 7%)");

        opcaoPagamento = teclado.nextInt();

        switch (opcaoPagamento) {
            case 1:
                valorFinal = valorVenda * 0.9;
                System.out.printf("Valor final da venda à vista: R$ %.2f", valorFinal);
                break;
            case 2:
                valorFinal = valorVenda * 0.95;
                System.out.printf("Valor final da venda a prazo 30 dias: R$ %.2f", valorFinal);
                break;
            case 3:
                valorFinal = valorVenda;
                System.out.printf("Valor final da venda a prazo 60 dias: R$ %.2f", valorFinal);
                break;
            case 4:
                valorFinal = valorVenda * 1.05;
                System.out.printf("Valor final da venda a prazo 90 dias: R$ %.2f", valorFinal);
                break;
            case 5:
                valorFinal = valorVenda * 0.92;
                System.out.printf("Valor final da venda com cartão de débito: R$ %.2f", valorFinal);
                break;
            case 6:
                valorFinal = valorVenda * 0.93;
                System.out.printf("Valor final da venda com cartão de crédito: R$ %.2f", valorFinal);
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }

        teclado.close();
    }
}