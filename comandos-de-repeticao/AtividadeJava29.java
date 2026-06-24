import java.util.Scanner;

public class AtividadeJava29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = leitor.nextInt();
            
            if (numero >= 100 && numero <= 200) {
                System.out.println("Você digitou um número entre 100 e 200");
            } else {
                System.out.println("Você digitou um número fora da faixa entre 100 e 200");
            }
        }
        
        leitor.close();
    }
}