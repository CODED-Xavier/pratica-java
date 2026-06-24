public class AtividadeJava31 {
    public static void main(String[] args) {
        System.out.println("Fahrenheit | Celsius");
        System.out.println("--------------------");
        
        for (int f = 50; f <= 65; f++) {
            double c = (5.0 / 9.0) * (f - 32); 
            
            System.out.printf("    %d     |  %.2f\n", f, c);
        }
    }
}