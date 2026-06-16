import java.util.Scanner;

public class AtividadeJava19 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = input.nextInt();

        if (n1 >= n2 && n1 >= n3){
            System.out.print(n1 + " e o maior numero entre os tres.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.print(n2 + " e o maior entre os tres.");
        } else {
            System.out.print(n3 + " e o maior entre os tres.");
        }

        input.close();
     }
    
}
