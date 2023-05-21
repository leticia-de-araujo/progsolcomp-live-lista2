/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: NumeroMenorQue0
Data: 21/05/2023
 */

import java.util.Scanner;

public class NumeroMenorQue0 {
    public static void main(String[] args) throws Exception {
        double numero = 0;

        Scanner teclado = new Scanner(System.in);

        while (numero >= 0) {
            System.out.println("Digite um número: ");
            numero = teclado.nextDouble();
        }

        teclado.close();
    }
}