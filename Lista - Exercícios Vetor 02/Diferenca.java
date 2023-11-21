import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a, b, c;
        int i;
        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("\nDigite o " + (i + 1) + "º número do vetor A: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("\nDigite o " + (i + 1) + "º número do vetor B: ");
            b[i] = in.nextInt();

            for (int j = 0; j < TAM; j++) {
                if (b[i] != a[j]) {
                    c[i] = b[i];
                }
            }
        }

        System.out.print("Os valores do vetor C são: ");

        for (i = 0; i < TAM; i++) {
            if (c[i] == 0) {
            } else {
                System.out.print(c[i] + " ");

            }
        }
		
        in.close();
        System.exit(0);
    }
}
