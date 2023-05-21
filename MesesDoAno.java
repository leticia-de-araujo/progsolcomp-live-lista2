/* Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: MesesDoAno
Data: 21/05/2023
 */

import java.util.Scanner;

public class MesesDoAno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes;

        System.out.print("Digite um número entre 1 e 12 correspondente a um mês: ");
        mes = teclado.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Mês: Janeiro - Estação: Verão");
                break;
            case 2:
                System.out.println("Mês: Fevereiro - Estação: Verão");
                break;
            case 3:
                System.out.println("Mês: Março - Estação: Outono");
                break;
            case 4:
                System.out.println("Mês: Abril - Estação: Outono");
                break;
            case 5:
                System.out.println("Mês: Maio - Estação: Outono");
                break;
            case 6:
                System.out.println("Mês: Junho - Estação: Inverno");
                break;
            case 7:
                System.out.println("Mês: Julho - Estação: Inverno");
                break;
            case 8:
                System.out.println("Mês: Agosto - Estação: Inverno");
                break;
            case 9:
                System.out.println("Mês: Setembro - Estação: Primavera");
                break;
            case 10:
                System.out.println("Mês: Outubro - Estação: Primavera");
                break;
            case 11:
                System.out.println("Mês: Novembro - Estação: Primavera");
                break;
            case 12:
                System.out.println("Mês: Dezembro - Estação: Verão");
                break;
            default:
                System.out.println("Número inválido de mês.");
                break;
        }

        teclado.close();
    }
}