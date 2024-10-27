import java.util.Scanner;
public class grafico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int alunos = ler.nextInt(), numDis = ler.nextInt(), numAprov, i=1;
        String dis;
        for(;i<=numDis;i++) {
            dis = ler.next();
            numAprov = ler.nextInt();
            disciplina(dis, alunos, numAprov);
        }
    }
    public static void disciplina(String dis, int alunos, int numAprov) {
        int neg, i;
        String positiva="", negativa ="";
        neg = alunos - numAprov;
        for(i=1;i<=numAprov;i++)
            positiva+=("*");
        for(i=1;i<=neg;i++)
            negativa+=("*");
        System.out.println("Disciplina: " + dis);
        System.out.println("- Positivas: " + positiva);
        System.out.println("- Negativas: " + negativa);
    }
}
