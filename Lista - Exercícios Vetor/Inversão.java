package vector;
import java.util.Scanner;

public class Inversão {
	public static void main (String []args) {
		
		Scanner in = new Scanner (System.in);
		
		final int TAM = 10;
		int i, j;
		int[] a, b;
		
		a = new int [TAM];
		b = new int [TAM];
		
		j = TAM - 1;
		for(i = 0; i <TAM; i++) {
			System.out.println("Entre com o " +(i+1)+ "o valor");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
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
	}
}
