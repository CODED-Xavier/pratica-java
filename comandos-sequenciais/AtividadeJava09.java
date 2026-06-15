import java.util.Scanner;

public class AtividadeJava09 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Voce quer ver um truque maneiro? \nDigite seu primeiro caracter: ");
        String char1 = input.next();
        System.out.print("Digite seu segundo caracter: ");
        String char2 = input.next();
        
        String char3 = char1;
        System.out.println("Primeiro eu passo o primeiro caracter para uam variavel temporaria...");
        
        char1 = char2;
        System.out.println("Agora eu passei O segundo caracter para o primero!");

        char2 = char3;
        System.out.println("Agora eu passei o primeiro caracter que estava na variavel temporaria para o lugar do segundo caracter.");
        
        System.out.printf("Agora se eu disse ao meu código para mostrar seu primeiro caracter, ele mostrara: %s ! \n E se eu pedir o seu segundo caracter ele mostrara: %s !", char1, char2);

        System.out.print("O que? isso foi bem maneiro para mim.");
        input.close();
    }

} 