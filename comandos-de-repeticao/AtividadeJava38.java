import java.util.Scanner;

public class AtividadeJava38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor de x: ");
        double x = leitor.nextDouble();
        
        double s = 0;
        
        for (int i = 1; i <= 20; i++) {
            double termo = 1.0 / (x - i);
            System.out.println("Termo " + i + ": " + termo);
            s += termo;
        }
        
        System.out.println("O valor total de S é: " + s);
        
        leitor.close();
    }
}