public class Tabuada {
    public static void main(String[] args) {
        int i;
        for(i=1; i<10; i++) {
            System.out.println("Tabuada do "+i);
        }
        for(int j=1; j<=10; j++) {
            int t = j*i;
            System.out.println(j+" x "+i+" = "+t);
        }
        System.exit(0);
    }
}