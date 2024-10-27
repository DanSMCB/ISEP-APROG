import java.util.Scanner;
public class ExY {
    public static void main(String[] args) {
        int n, i, a;
        Scanner ler = new Scanner(System.in);
        do {
            n = ler.nextInt();
        }while(n<=0);
        a = 0;
        for(i=1;i<=n/2;i++){
            if(n%i==0){
                if(i % 3 == 0){
                    System.out.println(i);
                    a=1;
                }
            }
        }
        if(a==0) System.out.println("sem divisores multiplos de 3");
    }
}