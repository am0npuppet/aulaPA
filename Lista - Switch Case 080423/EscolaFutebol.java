package exercices;
import java.util.Scanner;
public class EscolaFutebol {
	public static void main(String[] args) {
		int idade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a idade do aluno como inteiro: ");
		idade = in.nextInt();
		switch(idade) {
		case 6:
			System.out.println("Dente-de-Leite");
			break;
		case 7:
			System.out.println("Júnior");
			break;
		case 8:
			System.out.println("Júnior-Max");
			break;
		case 9:
			System.out.println("Júnior-Master");
			break;
		case 10:
			System.out.println("Master");
			break;
		default:
			System.out.println("Idade não suportada!");
			System.exit(0);
			
		} in.close();
	}

}
