import java.util.Scanner;

public class AtividadeJAVA51 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int s = 0, n = 0, fs = 0, mn = 0, tf = 0, tm = 0;
        
        for (int i = 0; i < 20; i++) {
            char sx = leitor.next().charAt(0), r = leitor.next().charAt(0);
            if (r == 'S') s++; else n++;
            if (sx == 'F') { tf++; if (r == 'S') fs++; }
            else { tm++; if (r == 'N') mn++; }
        }
        
        System.out.println(s);
        System.out.println(n);
        System.out.println(tf == 0 ? 0 : (fs * 100.0) / tf);
        System.out.println(tm == 0 ? 0 : (mn * 100.0) / tm);
    }
}