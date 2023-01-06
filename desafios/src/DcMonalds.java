/*Desafio
Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era gostoso. Porém, ficou horrorizado como algumas coisas no aplicativo do cardápio estavam erradas. Então, você se ofereceu para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente, ele te explicou que a vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:

Pao
Presunto
Carne
Pao

Ajude o restaurante a programar isso.

Entrada
A entrada serão os ingredientes que compõem o lanche.

Saída
A saída deverá ser o lanche montado com as palavras que definem os ingredientes.

Exemplo
Entrada	                                Saída
Pao;Presunto;Carne;Pao     	            Pao
                                        Presunto
                                        Carne
                                        Pao 
Pao;Picles;Tomate;Pao 	                Pao
                                        Picles
                                        Tomate       
                                        Pao
Pao;Tomate;Carne;Pao	                Pao
                                        Tomate
                                        Carne
                                        Pao
           */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        

        if(Objects.nonNull(ingredientes)){
            listaIngredientes = ingredientes.split(";");
            Arrays.stream(listaIngredientes).forEach(ingrediente -> {
                System.out.println(ingrediente);
            });

        }
        leitor.close();

    }
}
