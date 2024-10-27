import java.util.Scanner;
public class Capicua {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, tentativas=0;
        do {
            n = ler.nextInt();
            tentativas++;
        }while(!capicua(n) && tentativas<5);
        if (capicua(n)) System.out.println("capicua");
        else System.out.println("tentativas excedidas");
    }
    public static boolean capicua (int num){
        int inverso=0, alg, aux = num;
        do {
            alg = num % 10;
            inverso = inverso*10 + alg;
            num = num / 10;
        }while(num>0);
        return inverso == aux;
    }
}