/*Faça um programa que leia uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuario informe um valor valido. */

package exercicios;

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        
        System.out.println("Digite uma nota de 0 a 10: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Valor inválido, por favor digite uma nota valida.");
            nota = scan.nextInt();
            
        }
        scan.close();
    }
}
