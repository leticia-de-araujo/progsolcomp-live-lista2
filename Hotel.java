/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Hotel
Data: 21/05/2023
 */

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numeroDiarias;
        double valorDiaria = 60.0;
        double taxaServico = 0.0;
        double valorTotal;

        System.out.print("Informe o número de diárias: ");
        numeroDiarias = teclado.nextInt();

        if (numeroDiarias > 15) {
            taxaServico = 5.5;
        } else if (numeroDiarias == 15) {
            taxaServico = 6.0;
        } else {
            taxaServico = 8.0;
        }

        valorTotal = numeroDiarias * (valorDiaria + taxaServico);

        System.out.printf("Valor total da hospedagem: R$ %.2f", valorTotal);
        

        teclado.close();
    }
}