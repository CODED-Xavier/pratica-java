import java.util.Scanner;

public class AtividadeJava40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor de K (base): ");
        double k = leitor.nextDouble();
        
        System.out.print("Digite o valor de N (expoente): ");
        double n = leitor.nextDouble();
        
        double resultado = Math.pow(k, n);
        
        System.out.println("O resultado de K elevado a N é: " + resultado);
        
        leitor.close();
    }
}