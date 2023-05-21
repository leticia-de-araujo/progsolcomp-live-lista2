/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Conceito
Data: 21/05/2023
 */

import java.util.Scanner;

public class Conceito {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int nota;

        System.out.print("Digite a nota do aluno (0 a 100): ");
        nota = teclado.nextInt();

        if (nota >= 0 && nota <= 49) {
            System.out.println("Conceito: Insuficiente");
        } else if (nota >= 50 && nota <= 64) {
            System.out.println("Conceito: Regular");
        } else if (nota >= 65 && nota <= 84) {
            System.out.println("Conceito: Bom");
        } else if (nota >= 85 && nota <= 100) {
            System.out.println("Conceito: Ótimo");
        } else {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 100.");
        }

        teclado.close();
    }
}
