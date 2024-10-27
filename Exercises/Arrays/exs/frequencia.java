import java.util.Scanner;
public class frequencia {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int N= ler.nextInt();
        int[] arr = new int[N];
        leitura(arr,N);
        frequencias(analiseNotas(arr,N));
    }
    public static void leitura(int[] arr, int N){
        for(int i=0;i<N;i++){
            arr[i] = ler.nextInt();
        }
    }
    public static void frequencias(int[] arr1){
        for(int i=0;i<=20;i++){
            System.out.println(i + " " + arr1[i]);
        }
    }
    public static int[] analiseNotas(int[] arr, int N){
        int[] arr1 = new int[21];
        for(int a=0;a<=20;a++){
            for(int i=0;i<N;i++){
                if(arr[i]==a) arr1[a]++;
            }
        }
        return arr1;
    }
}