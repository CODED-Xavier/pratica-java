import java.util.Scanner;

public class AtividadeJava15 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = input.nextDouble();

        if (valor% 2 == 0) {
            System.out.print("O valor é par!");
        } else {
            System.out.print("O valor é impar!");
        }
       
        input.close();
    }  
}
