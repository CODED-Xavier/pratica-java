import java.util.Scanner;

public class AtividadeJava18 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero de maças a serem compradas: ");
        int quantidade = input.nextInt();

        if (quantidade >= 12) {
           double valor = quantidade * 0.25;
            System.out.printf("O total foi de R$: %.2f", valor);
        } else {
            double valor = quantidade *0.30;
            System.out.printf("O total foi de R$: %.2f", valor);
        }


        input.close();
    }
    
}
