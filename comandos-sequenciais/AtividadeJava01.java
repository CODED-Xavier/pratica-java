import java.util.Scanner;

public class AtividadeJava01 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");

        int n1 = leitor.nextInt();

        System.out.print("Digite o segundo numero: ");

        int n2 = leitor.nextInt();

        System.out.println ("O resultado da sua multiplicacao e: " + (n1 * n2));

        leitor.close();
    }
}