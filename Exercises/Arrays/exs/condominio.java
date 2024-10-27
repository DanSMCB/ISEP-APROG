import java.util.Scanner;
public class condominio {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] proprietarios = new String[4][3];
        leitura(proprietarios);
        String nome = ler.nextLine();
        informacoes(nome,proprietarios);
    }
    public static void leitura(String[][] proprietarios){
        for(int entrada=0;entrada<3;entrada++){
            for(int piso=0;piso<4;piso++){
                proprietarios[piso][entrada] = ler.nextLine();
            }
        }
    }
    public static void informacoes(String nome, String[][] proprietarios){
        int resultados=0;
        for(int entrada=0;entrada<3;entrada++){
            for(int piso=0;piso<4;piso++){
                if(proprietarios[piso][entrada].equals(nome)){
                    System.out.println("nome="+nome);
                    System.out.println("entrada="+entrada);
                    System.out.println("piso="+piso);
                    resultados=1;
                }
            }
        }
        if(resultados==0) System.out.println("Nao mora no predio");
    }
}
