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