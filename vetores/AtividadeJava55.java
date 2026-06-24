import java.util.Scanner;

public class AtividadeJava55 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] v = new double[10];

        for (int i = 0; i < 10; i++) {
            v[i] = leitor.nextDouble();
            if (i % 2 != 0) v[i] *= 5;
        }

        for (double n : v) System.out.println(n);
    }
}