import java.util.Scanner;

public class AtividadeJava22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" 1 - Adicao\n 2 - Subtracao \n 3 - Divisao\n 4 - Multiplicacao\n Digite o numero correspondente do menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                {
                    System.out.println("Digite o primeiro numero para a Adicao.");
                    int n1 = input.nextInt();
                    System.out.println("\nDigite o segundo numero para a Adicao.");
                    int n2 = input.nextInt();
                    int resultado = (n1 + n2);
                    System.out.println("\n O resultado da adicao e: " + resultado);
                    break;
                }
            case 2:
                {
                    System.out.println("Digite o primeiro numero para a Subtracao.");
                    int n1 = input.nextInt();
                    System.out.println("\nDigite o segundo numero para a Subtracao.");
                    int n2 = input.nextInt();
                    int resultado = (n1 - n2);
                    System.out.println("\n O resultado da Subtracao e: " + resultado);
                    break;
                }
            case 3:
                {
                    System.out.println("Digite o primeiro numero para a Divisao.");
                    int n1 = input.nextInt();
                    System.out.println("\nDigite o segundo numero para a Divisao.");
                    int n2 = input.nextInt();
                    int resultado = (n1 / n2);
                    System.out.println("\n O resultado da Divisao e: " + resultado);
                    break;
                }
            case 4:
                {
                    System.out.println("Digite o primeiro numero para a Multiplicacao.");
                    int n1 = input.nextInt();
                    System.out.println("\nDigite o segundo numero para a Multiplicacao.");             
                    int n2 = input.nextInt();
                    int resultado = (n1 * n2);
                    System.out.println("\n O resultado da Multiplicacao e: " + resultado);
                    break;
                }
            default:
                break;
        }

        input.close();
    }
}