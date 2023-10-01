import java.util.Scanner;
public class Pares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=2;

        do {
            System.out.println(i);
            i = i+2;

        }while(i<501);
        in.close();
        System.exit(0);
    }
}