import java.util.Scanner;
public class top3 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Object[][] funcionarios = new Object[2][100];
        leitura(funcionarios);
        top_3(funcionarios);
    }
    public static void leitura(Object[][] funcionarios){
        int i=0;
        do {
            funcionarios[0][i] = ler.next();
            if(funcionarios[0][i].equals("fim")){
                funcionarios[0][i]=null;
                break;
            }
            funcionarios[1][i]=ler.nextInt();
            i++;
        }while(funcionarios[1][i-1]!=null);
    }
    public static void top_3(Object[][] funcionarios){
        int maior, aux=100000, i=1, j;
        do {
            maior = maior(funcionarios,aux);
            do {
                j=0;
                if((int)funcionarios[1][j]==maior){
                    System.out.println("#"+i+":"+funcionarios[0][j]+":"+funcionarios[1][j]);
                    i++;
                }
                j++;
            }while(i<=3 && funcionarios[0][j]!=null);
            aux=maior;
        }while(i<=3);
    }
    public static int maior(Object[][] funcionarios, int aux){
        int maior=0, i=0;
        do {
            if((int)funcionarios[1][i]>maior && (int)funcionarios[1][i]<aux) maior=(int)funcionarios[1][i];
            i++;
        }while(funcionarios[0][i]!=null);
        return maior;
    }
}
