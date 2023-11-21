import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
	    
        int a[], i, p, u, r, n, l = 0;
        final int TAM = 11;

        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.print("\nDigite o " + (l + 1) + "º número: ");
            l++;
            n = in.nextInt();
            System.out.print("Na posição " + i + " a potência do número 2 por " + n + " é: ");
            r = 2;
		
            if (n == 0) {
                System.out.print("1\n ");
                a[i] = 1;
            } else if (n == 1) {
                System.out.print("2\n ");
                a[i] = 2;
            } else {
                p = 2;
		    
                while (r <= n) {
                    p = p * 2;
                    r++;
                    a[i] = p;
                }
                System.out.print(a[i] + "\n");
            }
        }

		in.close();
		System.exit(0);
    }
}
