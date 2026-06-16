import  java.util.Scanner;

public class AtividadeJava17 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero a ser lido: ");
        int numero1 = input.nextInt();
        
        System.out.print("Digite o segundo numeor a ser lido: ");
        int numero2 = input.nextInt();

        if (numero1 == numero2) {
            System.out.print("Os numeros são iguais! ");
        } else {
            System.out.print("Os números são diferentes! ");

            if (numero1 > numero2) {
                System.out.printf("O primeiro numero %d é maior", numero1);
            } else {
                System.out.printf("O segundo numero %d e maior!", numero2);
            }
        }

        input.close();
    }
}
