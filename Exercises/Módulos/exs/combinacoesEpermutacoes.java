import java.util.Scanner;
public class combinacoesEpermutacoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m=ler.nextInt(), n=ler.nextInt();
        if ((m>=n)){
            System.out.println("C("+m+","+n+")=" + combinacoes(m,n));
            System.out.println("P("+m+","+n+")=" + permutacoes(m,n));
        }
    }
    public static int fatorial(int m){
        int fatorial=m, i=m-1;
        do {
            fatorial = fatorial*i;
            i--;
        }while(i>0);
        return fatorial;
    }
    public static int combinacoes(int m, int n) {
        if ((n != 0)&&(n!=m))
            return fatorial(m) / (fatorial(n) * fatorial(m - n));
        else return 1;
    }
    public static int permutacoes(int m, int n) {
        if (m!=n) {
            return fatorial(m) / fatorial(m - n);
        } else return fatorial(m);
    }
}

