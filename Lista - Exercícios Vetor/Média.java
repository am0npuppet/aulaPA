package vector;
import java.util.Scanner;

public class Média {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		
		int i;
		int[] a;
		final int TAM = 4;
		a = new int[TAM];
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Digite o valor do " + (i + 1) + "º valor do vetor: ");
			a[i] = in.nextInt();
		}
		
		int soma = 0;
		
		for (i = 0; i < TAM; i++) {
			soma += a[i];
		}
		
		double media = 0;
				
		for (i = 0; i < TAM; i++) {
			media = (double) soma / TAM;
		}
		System.out.println("A média entre os valores é: " + media);
		
		in.close();
		System.exit(0);
 	}
 }
