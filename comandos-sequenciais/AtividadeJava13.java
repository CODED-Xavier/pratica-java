import java.util.Scanner;

public class AtividadeJava13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de fabrica do automovel: ");
        double valorFabrica = input.nextDouble();

        double valorImpostos = valorFabrica * 0.45;
        System.out.printf("O valor dos impostos sob este automovel e igual a: %.2f ", valorImpostos);

        double valorRevendedor = valorFabrica * 0.28;
        System.out.printf("\n O valor da porcentagem do revendendor e igual a: %.2f ", valorRevendedor);

        double valorTotal = valorFabrica + valorImpostos + valorRevendedor;
        System.out.printf("\n O valor final do seu automovel e de: %.2f", valorTotal);
        System.out.printf("\ntem certeza que não é melhor ir andando?");

        input.close();
    }
}