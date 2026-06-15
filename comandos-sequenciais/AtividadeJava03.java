import java.util.Scanner;

public class AtividadeJava03 {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quero dividir o número: ");

        int n1 = leitor.nextInt();

        System.out.print("Pelo número: ");
        int n2 = leitor.nextInt();

        int n3 = ( n1 / n2);
        int n4 = (n1 % n2);

        System.out.print("O número " + n1 + " dividido por " + n2 + " é igual a: " + n3 + "\n o resto da divisão é: " + n4);

        leitor.close();
    }
}
