import java.util.Scanner;

public class QualTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char turno = leitor.next().toUpperCase().charAt(0);
        
        if (turno == 'M'){
            System.out.println("Bom Dia!");
        }
        if (turno == 'V'){
            System.out.println("Boa Tarde!");
        }
        if (turno == 'N'){
            System.out.println("Boa Noite!");
        }
        else if (turno !=  'M' && turno != 'N' && turno != 'V') {
            System.out.println("Valor Inválido!");
        }   
        leitor.close();
    }
}