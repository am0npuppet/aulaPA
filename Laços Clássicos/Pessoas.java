import java.util.Scanner;

public class Pessoas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a quantidade de pessoas determinada: ");
		int totalPessoas = in.nextInt();
		
		if (totalPessoas != 15) {
			return;
		}
		
		int contadorMenos15 = 0;
		int contadorMenos30 = 0;
		int contadorMenos45 = 0;
		int contadorMenos60 = 0;
		int contadorMais60 = 0;
		
		for (int i = 1; i <= totalPessoas; i++) {
			System.out.println("Digite a idade da pessoa " + i);
			idade = in.nextInt();
			
			if (idade <= 15) {
				contadorMenos15++;
			} else if (idade <= 30) {
				contadorMenos30++;
			} else if (idade < 45) {
				contadorMenos45++;
			} else if (idade < 60) {
				contadorMenos60++;
			} else {
				contadorMais60++;
			}
		}
		
		for (int porcentagemFaixaEtaria = 1; porcentagemFaixaEtaria <= 4; porcentagemFaixaEtaria++) {
            int porcentagem;
            switch (porcentagemFaixaEtaria) {
                case 1:
                    porcentagem = (contadorMenos15 * 100) / totalPessoas;
                    System.out.println("Faixa etária " + porcentagemFaixaEtaria + ": \nQuantidade de pessoas: " + contadorMenos15 + "\n" + porcentagem + "% do total de pessoas");
                    break;
                case 2:
                    porcentagem = (contadorMenos30 * 100) / totalPessoas;
                    System.out.println("Faixa etária " + porcentagemFaixaEtaria + ": \nQuantidade de pessoas: " + contadorMenos30 + "\n" + porcentagem + "% do total de pessoas");

                    break;
                case 3:
                    porcentagem = (contadorMenos45 * 100) / totalPessoas;
                    System.out.println("Faixa etária " + porcentagemFaixaEtaria + ": \nQuantidade de pessoas: " + contadorMenos45 + "\n" + porcentagem + "% do total de pessoas");
                    break;
                case 4:
                    porcentagem = (contadorMenos60 * 100) / totalPessoas;
                    System.out.println("Faixa etária " + porcentagemFaixaEtaria + ": \nQuantidade de pessoas: " + contadorMenos60 + "\n" + porcentagem + "% do total de pessoas");
                    break;
                case 5:
                	porcentagem = (contadorMais60 * 100) / totalPessoas;
                    System.out.println("Faixa etária " + porcentagemFaixaEtaria + ": \nQuantidade de pessoas: " + contadorMenos60 + "\n" + porcentagem + "% do total de pessoas");
            }
        }
		
		in.close();
		System.exit(0);
	}

}
