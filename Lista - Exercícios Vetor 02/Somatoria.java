import java.util.Scanner;

public class Somatoria {    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], b[], i;
        final int TAM = 10;

        a = new int[TAM];
        b = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("\nDigite o " + (i + 1) + "º número para realizar a somatoria: ");
            a[i] = in.nextInt();
        }

        for (int j = 0; j < TAM; j++) {
            i = j;
            for (i = 0; i < TAM; i++) {
                b[j] = b[j] + a[i];
            }
        }

        System.out.println("A somatória que contida no vetor B é: ");
        for (i = 0; i < TAM; i++) {
            System.out.println(b[i] + " ");
        }

        in.close();
        System.exit(0);
    }
}
