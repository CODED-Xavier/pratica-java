public class AtividadeJava39 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}