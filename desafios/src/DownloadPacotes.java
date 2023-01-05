/*Desafio
Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para você fazer foi o
contador de porcentagem de download dos pacotes. Mas como o espaço para essa informação ficou pequeno, 
a empresa optou por fazer uma escala de 10 – 1. Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.

Entrada
A entrada será um número que representará a porcentagem

Saída
A saída serão as barras sem espaços entre elas. 

Exemplo     Saida
1	           / 
3	          ///
7	        ///////   */

import java.util.Scanner;
import java.util.Objects;

public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        StringBuilder progresso = new StringBuilder();

        if (Objects.nonNull(tamanho)) {
            for(int i = 0; i<tamanho; i++){
                progresso.append("/");

            }

            System.out.println(progresso);
        }
        leitor.close();
    }
}
