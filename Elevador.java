/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: Elevador
Data: 21/05/2023
 */

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) throws Exception {
        double cargaMaxima;
        int numeroMaxPessoas;
        double pesoTotal = 0;
        double peso;
        int numeroPessoas = 0;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite a carga máxima do elevador: ");
        cargaMaxima = teclado.nextDouble();

        System.out.println("Agora digite a quantidade máxima de pessoas que cabem no elevador: ");
        numeroMaxPessoas = teclado.nextInt();

        do {
            System.out.println("Digite o peso da pessoa entrando no elevador: ");
            peso = teclado.nextDouble();

            pesoTotal = pesoTotal + peso;

            numeroPessoas = numeroPessoas + 1;
        } while (pesoTotal <= cargaMaxima && numeroPessoas <= numeroMaxPessoas);

        System.out.println("Carga máxima ou lotação máxima do elevador atingida!");
         
        teclado.close();
    }
}