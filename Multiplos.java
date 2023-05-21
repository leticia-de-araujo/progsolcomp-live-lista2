/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Multiplos
Data: 21/05/2023
*/

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int A, B;
        
        System.out.println("Digite o valor de A: ");
        A = teclado.nextInt();
        
        System.out.println("Digite o valor de B: ");
        B = teclado.nextInt();
        
        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        
        teclado.close();
    }
}
