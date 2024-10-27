import java.util.Scanner;
public class ExL {
    public static void main(String[] args) {
        int n, i, div, a, num;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        a = 1;
        num = 1;
        do {
            i = 1;
            div = 0;
            for (; i <= (num / 2); i++){
                if (num % i == 0) div = div + i;
            }
            if(div == num){
                a += 1;
                System.out.println(num);
            }
            num += 1;
        }while(a<=n);
    }
}