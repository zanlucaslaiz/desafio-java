// Desafio
// Elabore um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.

// Entrada
// A entrada será o nome de três pessoas (clientes do banco).

// Saída
// O programa deve imprimir como saída na tela o nome da pessoa e sua posição na fila.

import java.util.Scanner; 
import java.util.ArrayList;

public class FilaBanco {
    public static void main(String[] args) { 
 
        Scanner nome = new Scanner(System.in); 

        String cliente1 = nome.nextLine();
        String cliente2 = nome.nextLine();
        String cliente3 = nome.nextLine();

        ArrayList<String> fila = new ArrayList<>();
        fila.add(cliente1);
        fila.add(cliente2);
        fila.add(cliente3);

        for (int i = 0; i < fila.size(); i++) {
            System.out.println(fila.get(i) + " - está na posição:" + (i+1));
        }

        nome.close();
    } 
}
