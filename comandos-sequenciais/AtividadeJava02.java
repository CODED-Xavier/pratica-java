import java.util.Scanner;

public class AtividadeJava02 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Quer saber o antecessor e o sucessor de um numero? \n Digite ele aqui: ");

        int n = leitor.nextInt();

        System.out.println("O antecessor do numero é: " + (n - 1) + "\n E o sucessor dele é " + (n + 1));
        
        leitor.close();
    }
}
