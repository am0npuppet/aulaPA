import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], i, j, d;
        final int TAM = 10;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("\nDigite um número: ");
            a[i] = in.nextInt();
            
            System.out.print("\nSão os divisores do número " + a[i] + " os seguintes: ");
            for (j = 1; j <= a[i]; j++) {
                d = a[i] % j;
                if (d == 0) {
                    System.out.print(j + " ");
                }
            }
        }

        in.close();
        System.exit(0);
    }
}
