import java.util.Scanner;

public class AtividadeJava04 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número para as operacoes: ");
        int n1 = input.nextInt();

        System.out.print("Agora digite o segundo numero: ");
        int n2 = input.nextInt();

        int soma = n1 + n2;
        int mult = n1 * n2;
        int divi = n1 / n2;


        System.out.printf(" A soma e igual a:  %d \n A multiplicacao entre eles e igual a: %d  \n A divisao e igual a: %d", soma, mult, divi);
        input.close();
    }
}