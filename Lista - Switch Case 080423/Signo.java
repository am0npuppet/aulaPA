package exercices;
import java.util.Scanner;
public class Signo {
	public static void main(String[] args) {
		int m, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o mês de nascimento como inteiro: ");
		m = in.nextInt();
		switch(m) {
		case 1:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==22 || d<21) {
				System.out.println("Capricórnio");
			}else {
				System.out.println("Aquário");
			}
			break;
		case 2:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==21 || d<19) {
				System.out.println("Aquário");
			}else {
				System.out.println("Peixes");
			}
			break;
		case 3:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==19 || d<21) {
				System.out.println("Peixes");
			}else {
				System.out.println("Áries");
			}
			break;
		case 4:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==21 || d<21) {
				System.out.println("Áries");
			}else {
				System.out.println("Touro");
			}
			break;
		case 5:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==21 || d<21) {
				System.out.println("Touro");
			}else {
				System.out.println("Gêmeos");
			}
			break;
		case 6:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==21 || d<21) {
				System.out.println("Gêmeos");
			}else {
				System.out.println("Câncer");
			}
			break;
		case 7:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==21 || d<23) {
				System.out.println("Câncer");
			}else {
				System.out.println("Leão");
			}
			break;
		case 8:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==23 || d<23) {
				System.out.println("Leão");
			}else {
				System.out.println("Virgem");
			}
			break;
		case 9:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==23 || d<23) {
				System.out.println("Virgem");
			}else {
				System.out.println("Libra");
			}
			break;
		case 10:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==23 || d<23) {
				System.out.println("Libra");
			}else {
				System.out.println("Escorpião");
			}
			break;
		case 11:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==22 || d<22) {
				System.out.println("Escorpião");
			}else {
				System.out.println("Sagitário");
			}
			break;
		case 12:
			System.out.println("Digite o dia de nascimento: ");
			d = in.nextInt();
			if(d==22 || d<22) {
				System.out.println("Sagitário");
			}else {
				System.out.println("Capricórnio");
			}
			break;
		default:
			System.out.println("Mês inválido");
			
		} in.close();
		
	} 

}
