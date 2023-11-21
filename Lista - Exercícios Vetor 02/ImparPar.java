import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i, a[], b[];
        final int TAM = 20;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Escreva o " + (i + 1) + "º número: ");
            a[i] = in.nextInt();

            if (a[i] % 2 == 0) {
                b[i] = a[i];
            }
        }

        System.out.print("\nSão ímpares: ");

        for (i = 0; i < TAM; i++) {

            if (a[i] % 2 == 1) {
                System.out.print(a[i] + " ");
            }

        }

        System.out.print("\nSão pares: ");
        for (i = 0; i < TAM; i++) {

            if (b[i] % 2 == 0 && b[i] != 0) {
                System.out.print(b[i] + " ");
            }

        }
		
        in.close();
        System.exit(0);
    }
}
