import java.util.Scanner;

public class AtividadeJava44 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n, s = 0, c = 0;
        
        while ((n = leitor.nextInt()) >= 0) {
            s += n;
            c++;
        }
        
        System.out.println("Soma: " + s);
        System.out.println("Média: " + (c == 0 ? 0 : (double) s / c));
    }
}