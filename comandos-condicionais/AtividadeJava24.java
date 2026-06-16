import java.util.Scanner;

public class AtividadeJava24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tarifaA = 0.5;
        double tarifaB = 0.8;
        double tarifaC = 1.0;

        System.out.print(" A - 1\n B - 2\n C - 3\n Digite um numero equivalente a sua classe consumidora: ");
        int cc = input.nextInt();

        switch (cc) {
            case 1:
                {
                    System.out.print("Digite a quantidade do consumo em quilowatts/hora (kw/h): ");
                    double consumo = input.nextDouble();

                    double vf = consumo * tarifaA;
                    System.out.print("O valor do fornecimento é de: R$" + vf);

                    double vp = vf + (0.3 * vf);
                    System.out.print("\nO valor a pagar após a soma do ICMS é de: R$" + vp);
                    break;
                }
            case 2: 
                {
                    System.out.print("Digite a quantidade do consumo em quilowatts/hora (kw/h): ");
                    double consumo = input.nextDouble();

                    double vf = consumo * tarifaB;
                    System.out.print("O valor do fornecimento é de: R$" + vf);

                    double vp = vf + (0.3 * vf);
                    System.out.print("\nO valor a pagar após a soma do ICMS é de: R$" + vp);
                    break;
                }
            case 3:
                {
                    System.out.print("Digite a quantidade do consumo em quilowatts/hora (kw/h): ");
                    double consumo = input.nextDouble();

                    double vf = consumo * tarifaC;
                    System.out.print("O valor do fornecimento é de: R$" + vf);

                    double vp = vf + (0.3 * vf);
                    System.out.print("\nO valor a pagar após a soma do ICMS é de: R$" + vp);
                    break;
                }
            default: 
                {
                    System.out.print("Numero digitado não correspondente.\nO programa será encerrado.");
                    break;
                }
                
        }

        input.close();
    }
}

