import java.util.Scanner;

public class AtividadeJava53 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] v = new double[10];
        double s = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = leitor.nextDouble();
            s += v[i];
        }

        System.out.println(s / 10);
    }
}