import java.util.Scanner;
public class primosATempoInteiro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lim1, lim2, a=0;
        do{
            lim1 = ler.nextInt();
        }while(lim1<0);
        do{
            lim2 = ler.nextInt();
        }while(lim2<0);
        for(int i=Math.min(lim1,lim2);i<=Math.max(lim1,lim2);i++){
            if(primosTempoInteiro(i)){
                System.out.println(i);
                a++;
            }
        }
        System.out.println("("+a+")");
    }
    public static boolean primosTempoInteiro(int n){
        int i=1, a=0;
        if(qntAlg(n)>1){
            if(!algPar(n)){
                if(verificacaoPrimo(n)){
                    a++;
                    do{
                        if(verificacaoPrimo(deslocamentoAlg(n))) a++;
                        n = deslocamentoAlg(n);
                        i++;
                    }while(i<qntAlg(n));
                }
            }
        }
        else if(verificacaoPrimo(n)) a=1;
        return a==qntAlg(n);
    }
    public static boolean verificacaoPrimo(int n){
        int i=2, div=0;
        if(n>2){
            do{
                if(n%i==0) div++;
                i++;
            }while(i<=n/2 && div==0);
        }
        return div == 0;
    }
    public static int qntAlg(int n){
        int qntAlg=0;
        do {
            n = n /10;
            qntAlg++;
        }while(n>0);
        return qntAlg;
    }
    public static int deslocamentoAlg(int n){
        int alg, n1;
            alg=n%10;
            n1 = (int) (alg*Math.pow(10,qntAlg(n)-1) + n/10);
        return n1;
    }
    public static boolean algPar (int n){
        int alg, algPar=0;
        do{
            alg = n%10;
            if (alg%2==0 && alg!=0) algPar=1;
            n=n/10;
        }while(n>0 && algPar==0);
        return algPar==1;
    }
}