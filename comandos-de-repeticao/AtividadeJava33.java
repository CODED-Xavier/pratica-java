public class AtividadeJava33 {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int i = 13; i <= 73; i++) {

            if (i % 2 == 0) {
                soma += i;
                contador++;
            }
        }

        double media = (double) soma / contador;
        
        System.out.println("A média dos números pares entre 13 e 73 é: " + media);
    }
}