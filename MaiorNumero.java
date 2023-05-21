/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: MaiorNumero
Data: 21/05/2023
 */

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) throws Exception {
        double n1, n2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = teclado.nextDouble();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else {
            System.out.println("O maior número é: " + n2);
        }

        teclado.close();
    }
}
