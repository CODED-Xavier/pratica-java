import java.util.Scanner;

public class AtividadeJava52 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] v = new int[10];
        int s = 0;

        for (int i = 0; i < 10; i++) {
            v[i] = leitor.nextInt();
            s += v[i];
        }

        System.out.println(s);
    }
}