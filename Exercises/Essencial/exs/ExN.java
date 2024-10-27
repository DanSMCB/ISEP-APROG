import java.util.Scanner;
public class ExN {
    public static void main(String[] args) {
        int n, n1, alg, cres, alg1, aux, i;
        Scanner ler = new Scanner(System.in);
        n1 = ler.nextInt();
        if(n1 >= 0) {
            do {
                n = ler.nextInt();
                aux = n;
                i = 0;
                cres = 0;
                alg1 = 10;
                do {
                    alg = n % 10;
                    if (alg < alg1) cres = (int) (cres + alg * Math.pow(10, i));
                    alg1 = alg;
                    n = n / 10;
                    i += 1;
                } while (n > 0);
                if ((aux > n1) && (cres == aux)) System.out.println(aux);
                n1 = aux;
            } while (aux >= 0);
        }
    }
}