import java.util.Scanner;
public class numArmstrong {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for(int i=0;i<=n;i++){
            if (armstrong(i)) System.out.println(i);
        }
    }
    public static boolean armstrong(int num){
        int qntAlg=0, aux=num, arm=0, alg, aux1=num;
        do {
            qntAlg++;
            num=num/10;
        }while(num>0);
        for(int i=1;i<=qntAlg;i++) {
            alg = aux%10;
            arm = (int) (arm + Math.pow(alg,qntAlg));
            aux=aux/10;
        }
        return arm == aux1;
    }
}
