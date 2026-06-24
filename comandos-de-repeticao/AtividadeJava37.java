public class AtividadeJava37 {
    public static void main(String[] args) {
        double s = 0;
        double numerador = 1;
        
        for (int i = 1; i <= 50; i++) {
            s += numerador / i;
            numerador += 2;
        }
        
        System.out.println("O valor de S é: " + s);
    }
}