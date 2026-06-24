import java.util.Scanner;

public class AtividadeJava62 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int m = leitor.nextInt();
        double[][] a = new double[m][m];
        double[] d = new double[m];
        double s = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = leitor.nextDouble();
                if (i + j == m - 1) {
                    s += a[i][j];
                    d[i] = a[i][j];
                }
            }
        }

        System.out.println("Soma: " + s);
        for (double n : d) System.out.println(n);
    }
}