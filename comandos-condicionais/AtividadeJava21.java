import java.util.Scanner;

public class AtividadeJava21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = input.nextInt();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2) ) {
            if (n1 == n2 && n2 == n3) {
                System.out.print("Estes numeros podem ser os valores dos lados de um triangulo equilatero!");
            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                System.out.print("Estes numeros podem ser os valores dos lados de um triangulo isosceles! ");
            }else {
                System.out.print("Esses numeros podem ser os valores dos lados de um triangulo escaleno!");
            }

        } else {
            System.out.print("Estes numeros não podem ser os lados de um triangulo.");
        }

        input.close();
    }
}