import java.util.Scanner;
public class ExZ {
    public static void main(String[] args) {
        int n, alg, dig, maiorImpar, a;
        double per, pares;
        Scanner ler = new Scanner(System.in);
        do {
            n = ler.nextInt();
        } while (n <= 0);
        maiorImpar = 0;
        pares = 0;
        alg = 0;
        a = 0;
        do {
            dig = n % 10;
            if(dig % 2 == 0) pares += 1;
            else if(dig > maiorImpar){
                maiorImpar = dig;
                a = 1;
            }
            n = n / 10;
            alg += 1;
        }while(n!=0);
        per =(pares / alg)*100;
        System.out.printf("%.2f", per);
        System.out.println("%");
        if (a == 0) System.out.println("nao ha algarismos impares");
        else System.out.println(maiorImpar);
    }
}