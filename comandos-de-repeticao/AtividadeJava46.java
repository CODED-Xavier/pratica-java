import java.util.Scanner;

public class AtividadeJava46 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        long f = 1;
        
        while (n > 1) {
            f *= n--;
        }
        
        System.out.println(f);
    }
}