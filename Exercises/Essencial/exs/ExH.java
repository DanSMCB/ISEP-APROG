import java.util.Scanner;
public class ExH {
    public static void main(String[] args) {
        int n, i, divisores;
        Scanner ler = new Scanner(System.in);
        do {
            n = ler.nextInt();
        }while (n <= 1);
        i = 1;
        divisores = 0;
        for (;i <= n/2;i++) {
            if (n % i == 0) divisores = divisores +1;
        }
        if (divisores > 2) System.out.println("nao e primo");
        else System.out.println("primo");
    }
}