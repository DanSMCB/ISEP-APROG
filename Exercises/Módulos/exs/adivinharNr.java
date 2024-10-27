import java.util.Scanner;
public class adivinharNr {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int n1;
        do{
            n1 = ler.nextInt();
        }while(n1<0 || n1>100);
        for(int i=1;i<=30;i++){
            System.out.println();
        }
        System.out.println(tentativas(n1));
    }
    public static int tentativas (int n1){
        int n2, tentativas=0;
        do {
            n2 = ler.nextInt();
            if (n2<n1) System.out.println("Tente maior");
            if (n2>n1) System.out.println("Tente menor");
            tentativas++;
        }while(n2!=n1);
        System.out.println("Acertou");
        return tentativas;
    }
}