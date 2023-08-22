package exercices;
import java.util.Scanner;
public class Professora {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int aluno, quantidade_mb, quantidade_b, quantidade_r, quantidade_i, somaTotal, porc;
			
			System.out.println("Digite a quantidade de alunos da sala: ");
			aluno = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tirou MB: ");
			quantidade_mb = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tirou B: ");
			quantidade_b = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tirou R: ");
			quantidade_r = in.nextInt();
			System.out.println("Digite a quantidade de alunos que tirou i: ");
			quantidade_i = in.nextInt();
			
			System.out.println("Qual porcentagem você deseja saber? \nMB = Digite 1  \nB = Digite 2  \nR = Digite 3 \nI = Digite 4 ");
			porc = in.nextInt();
      
			switch(porc) {
			case 1:
			somaTotal = (quantidade_mb*100/aluno);
			System.out.println("A porcentagem de alunos que tirou MB é de : "+somaTotal+"%");
			break;
			case 2:
				somaTotal = (quantidade_b*100/aluno);
				System.out.println("A porcentagem de alunos que tirou B é de : "+somaTotal+"%");
				break;
			case 3:
				somaTotal = (quantidade_r*100/aluno);
				System.out.println("A porcentagem de alunos que tirou R é de : "+somaTotal+"%");
				break;
			case 4:
				somaTotal = (quantidade_i*100/aluno);
				System.out.println("A porcentagem de alunos que tirou I é de : "+somaTotal+"%");
				break;
			default:
				System.out.println("Nota inválida!");
				System.exit(0);
          
			} in.close();
			
		}
}
