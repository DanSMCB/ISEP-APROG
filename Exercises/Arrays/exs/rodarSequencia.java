import java.util.Scanner;
public class rodarSequencia {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int n = ler.nextInt();
        int[] arr = new int[n];
        leitura_da_matriz(arr);
        comandos(arr);
    }
    public static void leitura_da_matriz(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]= ler.nextInt();
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }
    public static void comandos(int[] arr){
        String comando;
        do {
            comando = ler.next();
            if(!comando.equals("sair") && (comando.equals("direita") || comando.equals("esquerda"))){
                arr = comando(arr, comando);
                print(arr);
            }
        }while(!comando.equals("sair"));
    }
    public static int[] comando(int[] arr, String comando){
        int[] arr1 = new int[arr.length];
        switch (comando) {
            case "direita":
                for (int i = 0; i < arr.length; i++) {
                    if (i > 0) arr1[i] = arr[i - 1];
                    else arr1[i] = arr[arr.length - 1];
                }
                break;
            case "esquerda":
                for (int i = 0; i < arr.length; i++) {
                    if(i< arr.length-1) arr1[i] = arr[i+1];
                    else arr1[i] = arr[0];
                }
        }
        return arr1;
    }
}
