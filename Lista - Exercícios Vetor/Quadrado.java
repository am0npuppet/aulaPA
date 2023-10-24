import java.util.Scanner;

public class Quadrado {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int i;
		int[] a, b;
		final int TAM = 10;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Diite o " + (i + 1) + "º valor: ");
			a[i] = in.nextInt();
		}
		
		System.out.print("\nA = [ ");
		for (i = 0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(" ]");
		
		System.out.print("\nB = [ ");
		for (i = 0; i < TAM; i++) {
			b[i] = a[i] * a[i];
			System.out.print(b[i] + " ");
		}
		System.out.print("]");

		in.close();
		System.exit(0);
	}
}
