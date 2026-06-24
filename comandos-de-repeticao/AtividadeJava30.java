import java.util.Scanner;

public class AtividadeJava30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeMaiores = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = leitor.nextInt();
            
            if (idade >= 18) {
                quantidadeMaiores++; 
            }
        }
        
        System.out.println("Quantidade de pessoas maiores de idade: " + quantidadeMaiores);
        
        leitor.close();
    }
}