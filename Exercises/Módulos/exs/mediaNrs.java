import java.util.Locale;
import java.util.Scanner;
public class mediaNrs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int n , N, i=0, soma=0;
        double media;
        N = ler.nextInt();
        do {
            n = ler.nextInt();
            if(qntDig(n)<N){
                soma += n;
                i++;
            }
        }while(qntDig(n)<N && i<5);
        media = (double) soma / i;
        System.out.printf("%.2f\n",media);
    }
    public static int qntDig(int n){
        int qntDig=0;
        do{
            n = n / 10;
            qntDig++;
        }while(n>0);
        return qntDig;
    }
}
