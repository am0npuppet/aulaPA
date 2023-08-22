package exercices;
import java.util.Scanner;
public class MesesAno {
	public static void main(String[] args) {
		int m;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o mês do ano: ");
		m = in.nextInt();
		switch(m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mês possui 31 dias.");
			break;
		case 2:
			System.out.println("Este mês possui 28 dias.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Este mês possui 30 dias.");
			break;
		default:
			System.out.println("Mês inválido!");
			System.exit(0);
			
		} in.close();
	}

}
