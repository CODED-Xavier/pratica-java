import java.util.Scanner;;

public class AtividadeJava08 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do salario fixo: ");
        double salario = input.nextDouble();
        System.out.print("Digite o valor total das vendas em efetuadas no mes em dinheiro: ");
        double vendas = input.nextDouble();

        double bonus = vendas * 0.15;
        double salarioTotal = salario + bonus;

        System.out.printf("O valor fixo do seu salário e: %.2f \nSeu salario total e: %.2f \nSeu bonus foi de: %.2f parabens! ", salario, salarioTotal, bonus);

        input.close();

    }
}