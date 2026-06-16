import java.util.Scanner;

public class AtividadeJava16 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Didite o numero a ser verificado: ");
        int valor = input.nextInt();

        if (valor <0) {
            valor = (valor * -1);
        }
        
        System.out.print("O valor final e igual a: " + valor );
        input.close();
    }
}
