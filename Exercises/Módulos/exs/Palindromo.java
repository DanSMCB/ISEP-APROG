import java.util.Scanner;
public class Palindromo {
    public static boolean palindromo(String nome){
        StringBuilder inverso= new StringBuilder();
        int letras = nome.length(), i;
        for (i = letras -1;i>=0;i--){
            inverso.append(nome.charAt(i));
        }
        return nome.equals(inverso.toString());
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int a = 0;
        do{
            nome = ler.next();
            palindromo(nome);
            a += 1;
        }while (!palindromo(nome));
        System.out.println(a-1);
    }
}
