import java.util.Scanner;
public class ExK {
    public static void main(String[] args) {
        int n, i, div, a;
        Scanner ler = new Scanner(System.in);
        do {
            n = ler.nextInt();
        } while (n <= 0);
        a = 2;
        do {
            i = 1;
            div = 0;
            for (;i <= a/2;i++) {
                if (a % i == 0) div = div +1;
            }
            if (div < 2){
                System.out.println(a);}
            a += 1;
        }while(a <= n);
    }
}