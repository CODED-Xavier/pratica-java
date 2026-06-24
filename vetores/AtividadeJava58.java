import java.util.Scanner;

public class AtividadeJava58 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] a = new double[10], b = new double[10];

        for (int i = 0; i < 10; i++) a[i] = leitor.nextDouble();
        for (int i = 0; i < 10; i++) b[i] = a[9 - i];
        
        for (double n : b) System.out.println(n);
    }
}