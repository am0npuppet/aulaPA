public class Multiplos {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++) {
            if (i%10==0) {
            System.out.println(i+": Múltiplo de 10!");
            } else {
                System.out.println(i);
            }
        }
        System.exit(0);
    }
}