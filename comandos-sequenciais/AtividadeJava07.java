import java.util.Scanner;

public class AtividadeJava07 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Para calcular a area e o volume de um cilindro preciso de algumas informacoes. \nLembre que ambos devem estar na mesma unidade de medida! \n Digite a altura do cilindro: ");
        double h = input.nextDouble();
        System.out.print("Agora forneca o raio do cilindro: ");
        double r = input.nextDouble();

        double a = 2 * 3.14 * r * (h + r);
        double v = 3.14 * (r*r) * h;

        System.out.printf("A area calculada do cilindro e igual a: %.2f \nO volume calculado do cilindro e igual a: %.2f", a, v) ;

        input.close();



    }
}