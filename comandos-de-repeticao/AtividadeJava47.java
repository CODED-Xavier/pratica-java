import java.util.Scanner;

public class AtividadeJava47 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double h;
        
        while ((h = leitor.nextDouble()) >= 0) {
            System.out.println(leitor.nextInt() == 2 ? 72.7 * h - 58 : 62.1 * h - 44.7);
        }
    }
}