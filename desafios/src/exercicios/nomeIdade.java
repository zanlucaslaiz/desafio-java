/*Faça um programa que leia conjuntos de dois valores.
O primeiro representando o nome do aluno e o segundo representando a sua idade.
(pare o programa inserindo o valor 0 no campo nome) */
package exercicios;

import java.util.Scanner;

public class nomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Ler atravez do teclado

        String nome;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }
        scan.close();
    }

}
