import java.util.Scanner;

public class AtividadeJava32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int maiorValor = Integer.MIN_VALUE; 
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = entrada.nextInt();
            
            if (numero > maiorValor) {
                maiorValor = numero;
            }
        }
        
        System.out.println("O maior valor fornecido foi: " + maiorValor);
        
        entrada.close();
    }
}