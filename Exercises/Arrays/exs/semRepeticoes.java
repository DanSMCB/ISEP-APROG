import java.util.Scanner;
public class semRepeticoes {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int n= ler.nextInt();
        int[] arr = leitura(n);
        sem_repeticoes(arr);
    }
    public static int[] leitura(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = ler.nextInt();
        }
        return arr;
    }
    public static void sem_repeticoes(int[] arr){
        for(int i=0;i< arr.length;i++){
            boolean repeticao=false;
            for(int j=0;j<i;j++){
                if (arr[j] == arr[i]) {
                    repeticao = true;
                    break;
                }
            }
            if (!repeticao) System.out.println(arr[i]);
        }
    }
}
