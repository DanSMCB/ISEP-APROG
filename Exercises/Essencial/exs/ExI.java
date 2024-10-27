import java.util.Scanner;
public class ExI {
    public static void main(String[] args) {
        int n, m, i, a;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        m = ler.nextInt();
        i = 1;
        do {
            a = n * i;
            i = i +1;
        }while (a%m != 0);
        System.out.println(a);
    }
}