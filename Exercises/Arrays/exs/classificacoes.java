import java.util.Scanner;
public class classificacoes {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        n = ler.nextInt();
        double[] arr = new double[n];
        System.out.printf("media=%.1f", soma(arr,n)/n);
        System.out.println();
        System.out.println("reprovacoes=" + rep(arr,n));
    }
    public static double soma(double[] arr, int n){
        double soma=0;
        for(int i=0;i<n;i++){
            do{
                arr[i] = ler.nextInt();
            }while((arr[i]<0) || (arr[i]>20));
            soma = soma + arr[i];
        }
        return soma;
    }
    public static int rep(double[] arr,int n){
        int rep=0;
        for(int i=0;i<n;i++){
            if(arr[i]<10) rep++;
        }
        return rep;
    }
}