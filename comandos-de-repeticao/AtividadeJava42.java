import java.util.Scanner;

public class AtividadeJava42 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = leitor.nextDouble();
        
        System.out.print("Digite o valor de X: ");
        double x = leitor.nextDouble();
        
        double s = 0;
        
        for (int i = 1; i <= 20; i++) {
            double termo1 = i / (a - i + 1);
            double termo2 = (21 - i) / Math.pow(x, i);
            s += termo1 * termo2;
        }
        
        System.out.println("O valor de S é: " + s);
        
        leitor.close();
    }
}