import java.util.Scanner;

public class AtividadeJava48 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double pe, t = 0;
        
        while ((pe = leitor.nextDouble()) != 0) t += pe;
        
        int cp = leitor.nextInt();
        System.out.println(cp == 1 ? t * 0.9 : cp == 2 ? t * 0.95 : cp == 4 ? t * 1.1 : t);
    }
}