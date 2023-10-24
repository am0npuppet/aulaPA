import java.util.Scanner;

public class Soma {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		
		int i;
		int[] a, b, c;
		final int TAM = 10;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor do vetor A: " );
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor do vetor B: ");
			b[i] = in.nextInt();
		}
		
		System.out.print("\nA = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		System.out.print("\nB = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
				
		for (i = 0; i < TAM; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.print("\nC = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
		
		in.close();
		System.exit(0);
	}
}
