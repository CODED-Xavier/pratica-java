import java.util.Scanner;

public class AtividadeJava23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        double d = (b * b) - (4 * a * c); 

        if (d < 0 ) {
            System.out.print("Nao existem reaizes reais.");
        } else if (d == 0) {
            double x = (-b) / (2.0 * a);
            System.out.print("O resultado é " + x); 
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);

            System.out.println("A equacao possui duas raizes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        input.close();
    }    
}
