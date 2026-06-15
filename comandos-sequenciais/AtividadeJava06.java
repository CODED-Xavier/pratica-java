import java.util.Scanner;

public class AtividadeJava06 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do circulo:  ");
        float r = input.nextFloat();

        double area = 2 * 3.14 * r * r;

        System.out.print("Area do circulo: " + area);

        input.close();
    
    }
}