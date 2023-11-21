import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], i, produto;
        final int TAM = 5;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("\nEscreva o " + (i + 1) + "º número: ");
            a[i] = in.nextInt();

            for (int numero = 1; numero <= 10; numero++) {
                produto = a[i] * numero;
                System.out.println("\n" + numero + " X " + a[i] + " = " + produto);
            }
        }

        in.close();
        System.exit(0);
    }
}
