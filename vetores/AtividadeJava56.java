import java.util.Scanner;

public class AtividadeJava56 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] a = new double[10], b = new double[10], c = new double[10];

        for (int i = 0; i < 10; i++) a[i] = leitor.nextDouble();
        for (int i = 0; i < 10; i++) b[i] = leitor.nextDouble();
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }
    }
}