import java.util.Scanner;

public class AtividadeJava60 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[][] r = new double[4][5];
        double max = -Double.MAX_VALUE;
        int l = 0, c = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                r[i][j] = leitor.nextDouble();
                if (r[i][j] > max) {
                    max = r[i][j];
                    l = i;
                    c = j;
                }
            }
        }

        System.out.println("Maior: " + max);
        System.out.println("Linha: " + l + " Coluna: " + c);
    }
}