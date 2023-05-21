/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Fatorial
Data: 21/05/2023
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        int numero;
        int fatorial = 1;
        String message;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = teclado.nextInt();

        if (numero == 0) {
            fatorial = 1;
        }

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
       
        message = "O fatorial de " + numero + " é: " + fatorial;
        System.out.println(message);

        teclado.close();
    }
}