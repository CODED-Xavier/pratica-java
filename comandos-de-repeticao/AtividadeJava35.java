import java.util.Scanner;

public class AtividadeJava35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int n = leitor.nextInt();
        
        int h = 0;
        
        for (int i = 1; i <= n; i++) {
            h += i;
        }
        
        System.out.println("O valor de H é: " + h);
        
        leitor.close();
    }
}