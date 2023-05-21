/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: ParesAteMultiplo7
Data: 21/05/2023
 */

public class ParesAteMultiplo7 {
    public static void main(String[] args) throws Exception {
        int i = 0;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i % 7 != 0);
    }
}
