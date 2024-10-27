import java.util.Scanner;
public class algPosCom {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int N, n1, n2, posAlg=0, a=0, b=0;
        do {
            N = ler.nextInt();
        }while(N<=0);
        for(int i=1;i<=N;i++) {
            n1 = ler.nextInt();
            n2 = ler.nextInt();
            if (posAlg(n1,n2)>=posAlg) {
                posAlg=posAlg(n1,n2);
                a=n1;
                b=n2;
            }
        }
        if(posAlg>0) System.out.println(a+"/"+b);
        else System.out.println("sem resultados");
    }
    public static int posAlg(int n1, int n2){
        int alg1, alg2, qntDig1=0, qntDig2=0, posCom=0, aux1=n1, aux2=n2, menorQntDig, i;
        do {
            n1=n1/10;
            qntDig1++;
        }while(n1>0);
        do {
            n2=n2/10;
            qntDig2++;
        }while(n2>0);
        menorQntDig = Math.min(qntDig1, qntDig2);
        for (i=1;i<=menorQntDig;i++){
            alg1 = (int) ((aux1/Math.pow(10,qntDig1-i))%10);
            alg2 = (int) ((aux2/Math.pow(10,qntDig2-i))%10);
            if(alg1==alg2) posCom++;
            aux1= (int) (aux1%Math.pow(10,qntDig1-i));
            aux2= (int) (aux2%Math.pow(10,qntDig2-i));
        }
        return posCom;
    }
}
