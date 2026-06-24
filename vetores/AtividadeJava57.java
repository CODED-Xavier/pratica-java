import java.util.Scanner;

public class AtividadeJava57 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] a = new double[10], b = new double[10], c = new double[20];

        for (int i = 0; i < 10; i++) a[i] = leitor.nextDouble();
        for (int i = 0; i < 10; i++) b[i] = leitor.nextDouble();
        for (int i = 0; i < 10; i++) {
            c[i * 2] = a[i];
            c[i * 2 + 1] = b[i];
        }

        for (double n : c) System.out.println(n);
    }
}