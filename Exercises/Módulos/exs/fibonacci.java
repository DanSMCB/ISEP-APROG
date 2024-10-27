import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        if (verificacao(n)) System.out.println("e de Fibonacci");
        else System.out.println("nao e de Fibonacci");
    }
    public static boolean verificacao (int n){
        int fib=0, n1=0, n2=1, a=0, i=0;
        do {
            if (n == fib) a=1;
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            i++;
        }while(i<=n && a==0);
        return a==1;
    }
}
