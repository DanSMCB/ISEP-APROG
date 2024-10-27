import java.util.Scanner;
public class sequenciaCrescente {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int N;
        do{
            N=ler.nextInt();
        }while(N<=0);
        int[] arr = new int[N];
        leitura(arr,N);
        System.out.println("sempre crescente = " + crescentes(arr,N));
    }
    public static void leitura(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            arr[i] = ler.nextInt();
        }
    }
    public static boolean crescentes(int[] arr, int N){
        int a=0, verificacao=1;
        for (int i = 0; i < N; i++) {
            if (arr[i] <= a) {
                verificacao = 0;
                break;
            }
            a = arr[i];
        }
        return verificacao==1;
    }
}