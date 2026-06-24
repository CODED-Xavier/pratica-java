import java.util.Scanner;

public class AtividadeJava54 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] v = new double[10];
        double s = 0;
        int c = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = leitor.nextDouble();
            s += v[i];
        }

        double m = s / 10;
        for (double n : v) if (n > m) c++;

        System.out.println(c);
    }
}