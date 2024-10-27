import java.util.Scanner;
public class menoresElementos {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = leitura();
        System.out.println("menor="+menor(arr));
        System.out.println("ocorrencias="+ocorrencias(arr,menor(arr)));
    }
    public static int[] leitura(){
        int i=0;
        int[] arr= new int[100];
        do {
            arr[i] = ler.nextInt();
            i++;
        }while(arr[i-1]>0);
        return arr;
    }
    public static int menor(int[] arr){
        int i=0, menor=arr[1];
        do {
            if(arr[i]<menor) menor = arr[i];
            i++;
        }while(arr[i]>0);
        return menor;
    }
    public static int ocorrencias(int[] arr, int menor){
        int i=0, ocor=0;
        do {
            if(arr[i]==menor) ocor++;
            i++;
        }while(arr[i]>0);
        return ocor;
    }
}
