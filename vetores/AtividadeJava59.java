import java.util.Scanner;

public class AtividadeJava59 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] v = new double[10];
        double max = -Double.MAX_VALUE;
        int pos = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = leitor.nextDouble();
            if (v[i] > max) {
                max = v[i];
                pos = i;
            }
        }

        System.out.println("Maior: " + max);
        System.out.println("Posição: " + pos);
    }
}