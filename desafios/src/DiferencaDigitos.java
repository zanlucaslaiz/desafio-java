/*Desafio
O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a 
soma dos seus digitos.

Entrada 
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.

• A soma, basta realizar uma adição entre os dígitos.

• A diferença, é necessário substrair o resultado final dos dois valores.

Saída
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.

Explicação:
Produto de dígitos = 2 * 3 * 4 = 24
Soma dos dígitos = 2 + 3 + 4 = 9
Resultado = 24 - 9 = 15 */

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

   int numero = scan.nextInt();

   int produto = 1;
   int soma = 0;

   String numeroEmString = String.valueOf(numero);
   String[] split = numeroEmString.split("");

   int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

   for(int x=0; x<ints.length; x++) {
    produto *= ints[x];
    soma += ints[x];

   }

   System.out.println(produto - soma);

       // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
       
        scan.close();
   }
}


// https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html#valueOf%28java.lang.String,%20int%29