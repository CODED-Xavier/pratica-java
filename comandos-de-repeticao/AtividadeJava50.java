import java.util.Scanner;

public class AtividadeJava50 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double a, max = 0, min = Double.MAX_VALUE, sf = 0;
        int cf = 0, ch = 0;
        
        for (int i = 0; i < 15; i++) {
            a = leitor.nextDouble();
            char s = leitor.next().charAt(0);
            max = a > max ? a : max;
            min = a < min ? a : min;
            if (s == 'F') { sf += a; cf++; }
            else ch++;
        }
        
        System.out.println(max);
        System.out.println(min);
        System.out.println(cf == 0 ? 0 : sf / cf);
        System.out.println(ch);
    }
}