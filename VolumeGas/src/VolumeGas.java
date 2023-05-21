/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: VolumeGas
Data: 21/05/2023
 */

import java.util.Scanner;

public class VolumeGas {
    public static void main(String[] args) throws Exception {
        double volume;
        int tempo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o volume do gás em centímetros cúbicos: ");
        volume = teclado.nextDouble();

        tempo = 0;
        while (volume <= 1000) {
            volume = volume * 2;
            tempo += 1;
        }

        System.out.println("O tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos é de: " + tempo + " segundos.");
         
        teclado.close();
    }
}