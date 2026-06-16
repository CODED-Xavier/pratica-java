import java.util.Scanner;

public class AtividadeJava14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = input.nextInt();

        if (valor > 0) {
            System.out.print ("O valor e positivo.");
        } else if (valor < 0 ) {
            System.out.print ("O valor e negativo.");
        } else {
            System.out.print("O valor é zero!");
        }
        input.close();
    }
}
