import java.util.Scanner;

public class Regra {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a, b;
        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("\nDigite o " + (i + 1) + "º número para o vetor A: ");
            a[i] = in.nextInt();

            if (a[i] % 2 == 0 || a[i] == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        System.out.print("\nO vetor B possui os números: ");
        for (int i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
        }

		in.close();
		System.exit(0);
    }
}
