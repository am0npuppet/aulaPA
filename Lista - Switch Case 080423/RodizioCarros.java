package exercices;
import java.util.Scanner;
public class RodizioCarros {
	public static void main(String[] args) {
		int p;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o último dígito da placa do seu veículo: ");
		p = in.nextInt();
		switch(p) {
		case 1:
		case 2:
			System.out.println("Seu veículo não pode circular às Segundas-feiras!");
			break;
		case 3:
		case 4:
			System.out.println("Seu veículo não pode circular às Terças-feiras!");
			break;
		case 5:
		case 6:
			System.out.println("Seu veículo não pode circular às Quartas-feiras!");
			break;
		case 7:
		case 8:
			System.out.println("Seu veículo não pode circular às Quintas-feiras!");
			break;
		case 9:
		case 0:
			System.out.println("Seu veículo não pode circular às Sextas-feiras!");
			break;
		default:
			System.out.println("Digito inválido!");
			System.exit(0);
			
		} in.close();
	}

}
