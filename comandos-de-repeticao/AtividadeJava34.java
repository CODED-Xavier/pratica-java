import java.util.Scanner;

public class AtividadeJava34 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int dentroIntervalo = 0;
        int foraIntervalo = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            int valor = leitor.nextInt();
            
            if (valor >= 10 && valor <= 50) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }
        
        System.out.println("Valores dentro do intervalo [10...50]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo: " + foraIntervalo);
        
        leitor.close();
    }
}