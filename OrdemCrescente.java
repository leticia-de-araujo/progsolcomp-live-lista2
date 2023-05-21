/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: OrdemCrescente
Data: 21/05/2023
*/

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) throws Exception {
        double n1, n2, n3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite o segundo valor: ");
        n2 = teclado.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        n3 = teclado.nextDouble();

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
            }
        } else if (n3 < n1 && n3 < n2) {
            if (n1 < n2) {
                System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
            }
        }

        teclado.close();
    }
}
