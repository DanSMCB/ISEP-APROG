import java.util.Scanner;
public class ExF {
    public static void main(String[] args) {
        int num, alg, aux, inverso;
        Scanner ler = new Scanner(System.in);
        do{
            num = ler.nextInt();
        }while (num <= 0);
        inverso = 0;
        aux = num;
        do{
            alg = aux % 10;
            inverso = inverso*10 + alg;
            aux = aux / 10;
        }while(aux != 0);
        if (inverso == num) {
            System.out.println("capicua");
        }
        else {
            System.out.println("nao capicua");
        }
    }
}
