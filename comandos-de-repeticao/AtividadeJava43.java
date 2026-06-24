import java.util.Scanner;

public class AtividadeJava43 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double m = leitor.nextDouble(), mf = m;
        int t = 0;
        
        while (mf >= 0.5) {
            mf /= 2;
            t += 50;
        }
        
        System.out.println("Massa inicial: " + m);
        System.out.println("Massa final: " + mf);
        System.out.println("Tempo calculado em segundos: " + t);
    }
}