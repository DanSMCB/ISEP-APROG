import java.util.Scanner;
public class tabuadas {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int lim1 = lerValorInteiroPositivo(), lim2 = lerValorInteiroPositivo();
        mostrarTabuadasDoIntervalo(lim1, lim2);
    }
    public static int lerValorInteiroPositivo() {
        int n;
        do {
            n = ler.nextInt();
        } while (n <= 0);
        return n;
    }
    public static void mostrarTabuadasDoIntervalo(int lim1, int lim2) {
        for (int i = Math.min(lim1, lim2); i <= Math.max(lim1, lim2); i++) {
            mostrarTabuadaDoNumero(i);
        }
    }
    public static void mostrarTabuadaDoNumero(int n) {
        System.out.println("Tabuada de " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + i * n);
        }
    }
}
