import java.util.Scanner;

public class AtividadeJava12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Vamos a media aritimetica dos seguintes numeros: 7 8 e 9");
        double media1 = (7+8+9) / 3;
        System.out.print("\nA media dos numeros a cima e igual a: " + media1 );
        
        System.out.println("\nAgora a media aritimetica dos seguintes numeros: 4 5 e 6");
        double media2 = (4+5+6) / 3;
        System.err.println("A media dos numeros acima e igual a: " + media2);

        System.out.println("A soma entre as medias e igual a: " + (media1 + media2));
        System.out.println("A media entre estas medias e igual a: " + (media1+media2) / 2);

        input.close();
    }
}
