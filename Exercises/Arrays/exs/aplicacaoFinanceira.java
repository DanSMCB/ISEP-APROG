import java.util.Scanner;
public class aplicacaoFinanceira {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        double[] taxas = leitura_da_matriz();
        double deposito_inicial = ler.nextDouble();
        System.out.print("valor final=");
        System.out.printf("%.2f",valor_final(taxas,deposito_inicial));
        System.out.println();
    }
    public static double[] leitura_da_matriz(){
        double[] taxas = new double[6];
        for(int i=0;i<6;i++){
            taxas[i]=ler.nextDouble();
        }
        return taxas;
    }
    public static double valor_final(double[] taxas, double deposito_inicial){
        double valor_final=deposito_inicial;
        for(int i=0;i<6;i++){
            valor_final = valor_final*taxas[i] + valor_final;
        }
        return valor_final;
    }
}
