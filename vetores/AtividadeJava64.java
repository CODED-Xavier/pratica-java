import java.util.Scanner;

public class AtividadeJava64 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o número de linhas e colunas: ");
        int m = leitor.nextInt();
        int n = leitor.nextInt();
        
        double[][] b = new double[m][n];
        double maiorSoma = -Double.MAX_VALUE;
        int linhaVencedora = 0;

        for (int i = 0; i < m; i++) {
            double somaAtual = 0;
            for (int j = 0; j < n; j++) {
                b[i][j] = leitor.nextDouble();
                somaAtual += b[i][j];
            }

            if (somaAtual > maiorSoma) {
                maiorSoma = somaAtual;
                linhaVencedora = i;
            }
        }

        System.out.println("A linha com a maior soma é a linha: " + linhaVencedora);
        System.out.println("O valor da maior soma é: " + maiorSoma);
    }
}