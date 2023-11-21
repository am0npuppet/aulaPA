import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], proc, i, resp, h = 0;

        final int TAM = 10;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("\nDigite o " + (i + 1) + "° número do vetor: ");
            a[i] = in.nextInt();
        }

        do {
            System.out.println("\nDigite o número desejado: ");
            proc = in.nextInt();

            for (i = 0; i < TAM; i++) {
                if (proc == a[i]) {
                    System.out.println(proc + ": Este número existe no vetor!");
                    h = 1;
                }
            }

            if (h == 0) {
                System.out.println(proc + ": Este número não existe no vetor!");
            }

            System.out.println("\nDeseja continuar?\n1 = SIM\n2 = NÃO");
            resp = in.nextInt();

            if (resp == 1) {
                resp++;
            } else if (resp == 2) {
                resp = 0;
            } else {
                System.out.println(resp + ": Valor inválido!\nInsira outro valor.");
                resp++;
            }

            h = 0;
        } while (resp > 0 && resp <= 2);

        in.close();
        System.exit(0);
    }
}
