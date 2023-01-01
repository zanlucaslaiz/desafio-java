/*Faça um programa que leia 5 números:
Depois informa o maior número e a media desse números. */

package exercicios;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;     
        int count = 0;
        

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            
            soma = soma + numero;
            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));

        scan.close();
    }
}
