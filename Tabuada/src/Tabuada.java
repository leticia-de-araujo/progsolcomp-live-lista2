/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Tabuada
Data: 21/05/2023
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número positivo: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
        
        teclado.close();
    }
}
