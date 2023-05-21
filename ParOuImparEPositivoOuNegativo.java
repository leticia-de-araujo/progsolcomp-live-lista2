/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: ParOuImparEPositivoOuNegativo
Data: 21/05/2023
 */

import java.util.Scanner;

public class ParOuImparEPositivoOuNegativo {
    public static void main(String[] args) throws Exception {
        int valor;
        String message;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        valor = teclado.nextInt();

        if (valor % 2 == 0) {
           message = "O valor é par";
       } else {
           message = "O valor é ímpar";
       }
        
        if (valor > 0) {
            message += " e positivo.";
        } else if (valor < 0) {
            message += " e negativo.";
        } else {
            message += " e nulo";
        }

        System.out.println(message);

        teclado.close();
    }
}
