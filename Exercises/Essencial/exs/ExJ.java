import java.util.Scanner;
public class ExJ {
    public static void main(String[] args) {
        int N, n, alg, aux, a;
        double per, div, i, maiorPer;
        Scanner ler = new Scanner(System.in);
        N = ler.nextInt();
        if (N > 0) {
            a = 1;
            maiorPer = 0;
            for (;a <= N; a++){
                do {
                    n = ler.nextInt();
                }while(n<=0);
                div = 0;
                i = 0;
                aux = n;
                do {
                    alg = n % 10;
                    if ((alg != 0) && (aux % alg == 0)) {
                        div += 1;
                    }
                    n = n / 10;
                    i += 1;
                } while (n != 0);
                per = ((div / i) * 100);
                System.out.printf("%.2f", per);
                System.out.println("%");
                if (per > maiorPer) maiorPer = per;
            }
            System.out.printf("("+"%.2f", maiorPer);
            System.out.println("%)");
        }
    }
}