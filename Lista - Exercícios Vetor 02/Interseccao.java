import java.util.Scanner;

public class Interseccao {
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
	    
		int[] a, b, c;
	    int i;
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("\nDigite o " + (i + 1) + "º número do vetor A: ");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < TAM; i++){
			System.out.println("\nDigite o " + (i + 1) + "º número do vetor B: ");
			b[i] = in.nextInt();
		    
			for (int g = 0; g < TAM; g++){
			    
				if (b[i] == a[g]) {
					c[i] = a[g];
				}
			}
		}
	    
		System.out.print("Os valores deo vetor C são: ");
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
