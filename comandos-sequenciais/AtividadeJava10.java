import java.util.Scanner;

public class AtividadeJava10 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor a ser sacado: ");
        int saque = input.nextInt();

        int cedula200 = saque / 200;
        int resto = saque % 200;

        int cedula100 = resto / 100;
        resto = resto % 100;

        int cedula50 = resto / 50;
        resto  = resto % 50;

        int cedula20 = resto / 20;
        resto = resto % 20;

        int cedula10 = resto / 10;
        resto = resto % 10;

        int cedula5 = resto / 5;
        resto = resto % 5;

        int cedula2 = resto / 2;
        resto = resto % 2;

        int moeda = resto / 1;

        System.out.println("\nA quantidade de cedulas a serem entregues e: \n");
        System.out.println("cedulas de 200 = " + cedula200);
        System.out.println("Cedulas de 100 = " + cedula100);
        System.out.println("Cedulas de 50 = " + cedula50);
        System.out.println("cedulas de 20 = " + cedula20);
        System.out.println("cedulas de 10 = " + cedula10);
        System.out.println("cedulas de 5 = " + cedula5);
        System.out.println("cedulas de 2 = " + cedula2);
        System.out.println("Moedas de 1 = " + moeda);

        input.close();
    }
}