// Desafio
// Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar, o professor pediu para 
// que vocês fizessem um jogo que já existe com alguma modificação. A escolha de vocês foi "Pedra, Papel e Tesoura" e 
// a modificação foi mudar Pedra para Flecha, Papel para Escudo e Tesoura para Espada.

// Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:

// 1 - Flecha = Pedra
// 2 - Escudo = Papel
// 3 - Espada = Tesoura

// Entrada
// A entrada vão ser dois números representando cada um dos parâmetros. Sendo a primeira entrada o jogador e a segunda o inimigo.

// Saída
// A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas. A saída deve ser sem as aspas.

import java.util.Scanner;  

public class PedraPapelTesoura {  
    public static void main(String[] args){  

        Scanner leitor = new Scanner(System.in);  

        System.out.println("Bem=vindo ao jogo FlechaEscudoEspada!");
        System.out.println("Escolha sua arma e descubra quem ganha!");
        System.out.println("Flecha = 1, Escudo = 2, Espada = 3");


        int Jogador = leitor.nextInt();  
        int Inimigo = leitor.nextInt();  
        
        if (Jogador == 1 && Inimigo == 3){
            System.out.println("Ganhou");
        }
        if (Jogador == 2 && Inimigo == 1){
            System.out.println("Ganhou");
        }
        if (Jogador == 3 && Inimigo == 2){
            System.out.println("Ganhou");
        }
        if (Inimigo == 1 && Jogador == 3){
            System.out.println("Perdeu");
        }
        if (Inimigo == 2 && Jogador == 1){
            System.out.println("Perdeu");
        }
        if (Inimigo == 3 && Jogador == 2){
            System.out.println("Perdeu");
        } 
        if (Inimigo == Jogador){
            System.out.println("Empatou");
        }

        leitor.close();
     }

}