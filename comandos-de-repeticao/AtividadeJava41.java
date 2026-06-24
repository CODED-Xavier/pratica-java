import java.util.Scanner;

public class AtividadeJava41 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor de k (base): ");
        int k = leitor.nextInt();
        
        System.out.print("Digite o valor de n (quantidade de potências): ");
        int n = leitor.nextInt();
        
        for (int i = 1; i <= n; i++) {
            long resultado = (long) Math.pow(k, i);
            System.out.println(k + " elevado a " + i + " = " + resultado);
        }
        
        leitor.close();
    }
}