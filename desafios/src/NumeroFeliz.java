// Desafio
// Um número feliz é um número definido pelo seguinte processo:

// • Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
// • Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
// • Aqueles números para os quais esse processo termina em 1 são felizes.
// • Retorna true se n for um número feliz e false se não for.

// Escreva um algoritmo para determinar se o número n é feliz.

// Entrada
// A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se  o número é feliz ou não.

// Saída
// Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.

// Explicação:
// 1² + 9² = 82
// 8² + 2² = 68
// 6² + 8² = 100
// 1² + 0² + 0² = 1

import java.util.Scanner;
import java.lang.Math;

public class NumeroFeliz {
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in); // sempre que precisar uma leitura pelo teclado
        int n = scan.nextInt() ; // pede para digitar o numero
        int sum = 0;
        int num = n;

        while (num>9){
          while (num>0){
            int mod = num % 10;
            sum = sum + (int) Math.pow(mod,2);
            num = num /10;
          }
          num = sum;
          sum = 0;
          
          }
          if (num == 1){
            System.out.println(true);
          }
          else{
            System.out.println(false);
          }
          

        
    
        scan.close();
    }
}
    