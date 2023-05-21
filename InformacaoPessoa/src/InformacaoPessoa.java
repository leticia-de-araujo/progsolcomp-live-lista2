/* 
Nome do Aluno: Letícia de Araújo Nunes
RA: 942311533
Nome do Programa: InformacaoPessoa
Data: 21/05/2023
 */

import java.util.Scanner;

public class InformacaoPessoa {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nome, sobrenome, cidadeNascimento;
        int idade;
        char opcao;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Digite sua cidade de nascimento: ");
        cidadeNascimento = teclado.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        opcao = teclado.next().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Cidade de Nascimento: " + cidadeNascimento);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Digitação errada. Tente Novamente.");
        }

        teclado.close();
    }
}
