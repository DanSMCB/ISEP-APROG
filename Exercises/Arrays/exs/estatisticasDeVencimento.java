import java.util.Scanner;
public class estatisticasDeVencimento {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Object[][] arr = leitura();
        System.out.printf("%.1f",media(arr));
        System.out.println();
        salarioInferior(arr,media(arr));
    }
    public static Object[][] leitura(){
        int i=0;
        Object[][] arr = new Object[2][20];
        do {
            arr[0][i] = ler.next();
            if(arr[0][i].equals("fim")){
                arr[1][i]=0.0;
                break;
            }
            arr[1][i] = ler.nextDouble();
            i++;
        }while(!arr[0][i-1].equals("fim"));
        return arr;
    }
    public static double media(Object[][] arr){
        int i=0;
        double soma=0;
        do {
            soma = soma + (double) arr[1][i];
            i++;
        }while(arr[0][i]!=null);
        return soma/(i-1);
    }
    public static void salarioInferior(Object[][] arr, double media){
        int i=0;
        do {
            if((double)arr[1][i]<media && !arr[0][i].equals("fim")) System.out.println(arr[0][i]);
            i++;
        }while(arr[0][i]!=null);
    }
}
