import java.util.Scanner;

public class AtividadeJava49 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double s, somaS = 0, maxS = 0;
        int f, somaF = 0, p = 0, p1k = 0;
        
        while ((s = leitor.nextDouble()) >= 0) {
            f = leitor.nextInt();
            somaS += s;
            somaF += f;
            maxS = s > maxS ? s : maxS;
            if (s <= 1000) p1k++;
            p++;
        }
        
        System.out.println(p == 0 ? 0 : somaS / p);
        System.out.println(p == 0 ? 0 : (double) somaF / p);
        System.out.println(maxS);
        System.out.println(p == 0 ? 0 : (p1k * 100.0) / p);
    }
}