import java.util.Scanner;

public class AtividadeJava05 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero a ser convertido: ");
        float n = input.nextFloat();
        
        double pole = 0.39;

        System.out.print("Sao " + (n * pole));

        input.close();
    }
}