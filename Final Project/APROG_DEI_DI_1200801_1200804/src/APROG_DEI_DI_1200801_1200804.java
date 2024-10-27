import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class APROG_DEI_DI_1200801_1200804 {
    public static String path ="C:\\Users\\sebas\\IdeaProjects\\APROG_DEI_DI_1200801_1200804\\src\\img.txt";
    public static void main(String[] args) throws FileNotFoundException {
        //a)
        int n =Read_from_file_n();
        int[][] pic = Read_from_file_pic(n);
        //b)
        System.out.println("b)");
        print(pic);
        //c)
        System.out.println("c)");
        int[][] pic_filtered = filtro(pic,n);
        print(pic_filtered);
        //d)
        System.out.println("d)");
        System.out.println(verificacao(pic,pic_filtered));
        pic=pic_filtered;
        //e)
        System.out.println("e)");
        int[][] cores_predominantes = matriz_cores_predominantes(pic,n);
        print(cores_predominantes);
        //f)
        System.out.println("f)");
        cores_ordenadas(pic);
        //g)
        System.out.println("g)");
        int cor1=1, cor2=5;
        mudanca_de_cores(pic,cor1,cor2);
        print(pic);
        //h)
        System.out.println("h)");
        pic=reflexao(pic);
        print(pic);
        //i)
        System.out.println("i)");
        int linha_menos_intensa=linha_menos_intensa(pic);
        System.out.println(linha_menos_intensa);
        //j)
        System.out.println("j)");
        print(linha_mais_escura(pic,linha_menos_intensa-1));
    }
    public static int Read_from_file_n() throws FileNotFoundException {
        Scanner scan = new Scanner(new File(path));
        int n;
        scan.nextLine();
        n = Integer.parseInt(scan.nextLine());
        return n;
    }
    public static int[][] Read_from_file_pic(int n) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(path));
        int num;
        int[][] pic = new int[n][n];
        scan.nextLine();
        scan.nextLine();
        for(int linha=0;linha< pic.length;linha++){
            int j= Integer.parseInt(scan.nextLine());
            for(int coluna=0;coluna< pic.length;coluna++){
                num = j%10;
                pic[linha][(n-1)-coluna]=num;
                j=j/10;
            }
        }
        return pic;
    }
    public static void print(int[][] arr){
        for(int linha=0;linha< arr.length;linha++){
            for(int coluna=0;coluna< arr.length;coluna++){
                System.out.print(arr[linha][coluna]);
            }
            System.out.println();
        }
    }
    public static int[][] filtro(int[][] pic, int n){
        int[][] pic_filtered = new int[n][n];
        for(int linha=0;linha<n;linha++){
            for(int coluna=0;coluna<n;coluna++){
                if(linha==0 || coluna==0 || linha==n-1 || coluna==n-1) pic_filtered[linha][coluna] = pic[linha][coluna];
                else pic_filtered[linha][coluna] = (pic[linha][coluna] + pic[linha+1][coluna] + pic[linha-1][coluna] + pic[linha][coluna+1] + pic[linha][coluna-1])/5;
            }
        }
        return pic_filtered;
    }
    public static boolean verificacao(int[][] pic, int[][] pic_filtered){
        for(int linha=0;linha< pic.length;linha++){
            for(int coluna=0;coluna< pic.length;coluna++){
                if (pic[linha][coluna] != pic_filtered[linha][coluna]) return false;
            }
        }
        return true;
    }
    public static int[][] matriz_cores_predominantes(int[][] pic, int n){
        int[][] matriz_cores_predominantes = new int[2][2];
        if(n%2==0){
            matriz_cores_predominantes[0][0] = cor_predominante(pic,0,n/2, 0, n/2);
            matriz_cores_predominantes[0][1] = cor_predominante(pic,0,n/2, n/2, n);
            matriz_cores_predominantes[1][0] = cor_predominante(pic,n/2, n, 0, n/2);
            matriz_cores_predominantes[1][1] = cor_predominante(pic,n/2, n, n/2, n);
        } else{
            matriz_cores_predominantes[0][0] = cor_predominante(pic,0,n/2, 0, n/2);
            matriz_cores_predominantes[0][1] = cor_predominante(pic,0,n/2, n/2+1, n);
            matriz_cores_predominantes[1][0] = cor_predominante(pic,n/2+1, n, 0, n/2);
            matriz_cores_predominantes[1][1] = cor_predominante(pic,n/2+1, n, n/2+1, n);
        }
        return matriz_cores_predominantes;
    }
    public static int cor_predominante(int[][] pic, int m, int n, int o, int p){
        int[] frequencia = new int[10];
        for(int linha=m;linha<n;linha++){
            for(int coluna=o;coluna<p;coluna++){
                frequencia[pic[linha][coluna]]++;
            }
        }
        int predominante=0;
        for(int linha=1;linha<=9;linha++){
            if(frequencia[linha]>frequencia[predominante]) predominante=linha;
        }
        return predominante;
    }
    public static void cores_ordenadas(int[][] pic){
        int menor=menor_intensidade(pic,-1), aux;
        do {
            if(menor!=10) System.out.print("[" + menor + "]");
            aux = menor;
            menor = menor_intensidade(pic,menor);
        }while(menor!=aux);
        System.out.println();
    }
    public static int menor_intensidade(int[][] pic, int aux){
        int menor=10;
        for(int linha=0;linha<pic.length;linha++){
            for(int coluna=0;coluna<pic.length;coluna++){
                if(pic[linha][coluna]<menor && pic[linha][coluna]>aux) menor = pic[linha][coluna];
            }
        }
        return menor;
    }
    public static void mudanca_de_cores(int[][] pic, int cor1, int cor2){
        for(int linha=0;linha< pic.length;linha++){
            for(int coluna=0;coluna< pic.length;coluna++){
                if(pic[linha][coluna]==cor1) pic[linha][coluna]=cor2;
            }
        }
    }
    public static int[][] reflexao(int[][] pic){
        int[][] reflexao = new int[pic.length][pic.length];
        for(int linha=0;linha< pic.length;linha++){
            for(int coluna=0;coluna< pic.length;coluna++){
                reflexao[linha][coluna] = pic[linha][(pic.length-1)-coluna];
            }
        }
        return reflexao;
    }
    public static int linha_menos_intensa(int[][] pic){
        int soma = soma_linha(pic,0), l=1;
        for(int linha=1;linha< pic.length;linha++){
            if(soma_linha(pic,linha) <= soma){
                soma = soma_linha(pic,linha);
                l = linha+1;
            }
        }
        return l;
    }
    public static int soma_linha(int[][] pic, int linha){
        int soma=0;
        for(int coluna=0;coluna< pic.length;coluna++){
            soma = soma + pic[linha][coluna];
        }
        return soma;
    }
    public static int[][] linha_mais_escura(int[][] pic, int linha){
        for(int coluna=0;coluna< pic.length;coluna++){
            pic[linha][coluna]=9;
        }
        return pic;
    }
}