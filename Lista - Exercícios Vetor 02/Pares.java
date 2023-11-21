import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], i, p;
        final int TAM = 10;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("\nDigite um número: ");
            a[i] = in.nextInt();
            System.out.print("\nSão pares até o número " + a[i] + " os seguintes: ");

            for (p = 0; p < a[i]; p = p + 2) {
                System.out.print(p + " ");
            }
        }
        
        in.close();
        System.exit(0);
    }
}
