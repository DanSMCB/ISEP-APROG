import java.util.Scanner;
public class ExG {
    public static void main(String[] args) {
        int num, divisores, i;
        Scanner ler = new Scanner(System.in);
        do {
            num = ler.nextInt();
        }while (num <= 0);
        i = 1;
        divisores = 0;
        for(;i <= num;i++) {
            if(num%i == 0) {
                divisores = divisores + 1;
                System.out.println(i);
            }
            }
        System.out.println("("+divisores+")");
        }
}
