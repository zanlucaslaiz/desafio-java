/* Desafio
Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X fatias.
Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles devem pedir para satisfazer seu apetite.

Entrada 
A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de teste.
Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a quantidade de fatia que cada amigo deseja.

Saída
Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo a baixo:

Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim, pelo menos 2 pizzas devem ser encomendadas
para ter o número necessário de fatias.ntrada 
A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de teste.
Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a quantidade de fatia que cada amigo deseja.

Saída
Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo a baixo:

Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim, pelo menos 2 pizzas devem ser encomendadas
para ter o número necessário de fatias. */


import java.util.Scanner;
import java.lang.Math;

public class QuantidadeNecessaria {
  public static void main(String[] args) {
  final int SLICE = 4;
  Scanner scanner = new Scanner(System.in);

  int NAmigos = scanner.nextInt(); // NAmigos = quantidade de testes

      for (int i = 1; i <= NAmigos; i++) {
        double amigos = scanner.nextInt()*scanner.nextInt();
        double npizzas = Math.ceil(amigos/SLICE);
        System.out.println((int)npizzas); // (int) -> conversão do double para int
      }
      scanner.close();
  }

}