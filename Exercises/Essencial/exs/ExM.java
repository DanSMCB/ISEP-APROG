import java.util.Scanner;
public class ExM {
    public static void main(String[] args) {
        int N, n, n1, n2, a;
        Scanner ler = new Scanner(System.in);
        N = ler.nextInt();
        a = 1;
        n1 = 0;
        n2 = 1;
        if(N>0) {
            do {
                n = n1 + n2;
                System.out.println(n1);
                n1 = n2;
                n2 = n;
                a += 1;
            } while (a <= N);
        }
    }
}
