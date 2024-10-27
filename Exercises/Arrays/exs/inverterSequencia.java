import java.util.Scanner;
public class inverterSequencia {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int n = ler.nextInt();
        int[] arr = new int[n];
        leitura_da_matriz(arr);
        int[] inversa = inversao(arr);
        print(inversa);
    }
    public static void leitura_da_matriz(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]= ler.nextInt();
        }
    }
    public static int[] inversao(int[] arr) {
        int[] inversa = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inversa[i] = arr[(arr.length-1)-i];
        }
        return inversa;
    }
    public static void print(int[] inversa){
        for (int i = 0; i < inversa.length; i++) {
            System.out.println(inversa[i]);
        }
    }
}
