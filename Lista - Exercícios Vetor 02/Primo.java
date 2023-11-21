import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], i, resto, n = 1, b;
        double div;
        final int TAM = 10;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            resto = 0;
            n = 1;
            System.out.println("Escreva um número ");
            a[i] = in.nextInt();
            b = a[i];

            while (n <= b) {
                div = b % n;
		    
                if (div == 0) {
                    resto++;
                    n++;
                } else {
                    n++;
                }
            }

            if (resto < 2) {
                System.out.println("Não é primo");
            } else if (resto == 2) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }

		in.close();
		System.exit(0);
    }
}
