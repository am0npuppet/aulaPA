import java.util.Scanner;

public class Nascimento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i;

        do {
            System.out.println("Digite o ano atual: ");
            int anoAtual = in.nextInt();

            System.out.println("Digite o ano de seu nascimento: ");
            int anoNasc = in.nextInt();

            int idade = anoAtual - anoNasc;
            System.out.println("Sua idade é: "+idade);

            if (idade < 18) {
                System.out.println("Você é menor de idade!");
            } else {
                System.out.println("Você é maior de idade!");
            }
            
            System.out.println("Você deseja continuar?\n1-Sim\n2-Não");
            i = in.nextInt();

        } while (i < 2);
        
        System.out.println("Obrigado por utilizar nosso programa!");
        
        in.close();
        System.exit(0);
    }
}
