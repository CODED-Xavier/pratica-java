import java.util.Scanner;

public class AtividadeJava20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = input.nextInt();


        if (n1 < n2 && n2 < n3) {
            System.out.print(n1 + ", " + n2 + ", " + n3);
        } else if (n1 < n3 && n3 < n2) {
            System.out.print(n1 + ", " + n3 + ", " + n2);
        } else if (n2 < n1 && n1 < n3) {
            System.out.print(n2 + ", " + n1 + ", " + n3);
        } else if (n2 < n3 && n3 < n1) {
            System.out.print(n2 + ", " + n3 + ", " + n1);
        } else if (n3 < n1 && n1 < n2) {
            System.out.print(n3 + ", " + n1 + ", " + n2);
        } else {
            System.out.print(n3 + ", " + n2 + ", " + n1);
        }
        input.close();
    }
}