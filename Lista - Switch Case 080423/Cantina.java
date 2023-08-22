package exercices;
import java.util.Scanner;
public class Cantina {
	public static void main(String[] args) {
		int idProduto;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o código do produto como sendo inteiro: ");
		idProduto = in.nextInt();
		switch(idProduto) {
		case 1:
			System.out.println("Cachorro-Quente: R$8,00");
			break;
		case 2:
			System.out.println("Cheeseburger: R$12,00");
			break;
		case 3:
			System.out.println("X-Salada: R$15,00");
			break;
		case 4:
			System.out.println("Misto Quente: R$11,00");
			break;
		case 5:
			System.out.println("Pão na Chapa: R$6,00");
			break;
		default:
			System.out.println("Código do produto inválido!");
			System.exit(0);
			
		} in.close();
	}

}
