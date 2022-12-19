// Desafio
// Faça um programa que peça para 3 pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

// Entrada
// A entrada consiste em três números inteiros que representam a idade das pessoas.

// Saída
// A saída imprimirá a média de idade da turma.

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade1 = leitor.nextInt();
        int idade2 = leitor.nextInt();
        int idade3 = leitor.nextInt();

        int mediaIdade = (idade1 + idade2 + idade3 ) / 3;

        if (mediaIdade >= 0 && mediaIdade <= 25) {
            System.out.println("Jovem!");
        }
        if (mediaIdade >= 26 && mediaIdade <= 60){
            System.out.println("Adulto!");
        }
        if (mediaIdade > 60){
            System.out.println("Idosa!");
        }

        leitor.close();
    }
}