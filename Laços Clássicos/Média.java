
public class Média {
    public static void main(String[] args) {
    	
        double soma = 0;
        int i = 0;
        for (int n = 13; i <= 73; i++) {
            soma += n;
            i++;
        }
        
        double media = soma / i;
        System.out.println("Média aritmética dos números entre 13 e 73: " + media);
        
        System.exit(0);
    }
}
