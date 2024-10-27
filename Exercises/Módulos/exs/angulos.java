import java.util.Scanner;
public class angulos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
            a = ler.nextInt();
            b = ler.nextInt();
            c = ler.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            System.out.println("c=" + c);
            System.out.println("ang(a,b)=" + calcAng(a,b,c));
            System.out.println("ang(a,c)=" + calcAng(a,c,b));
            System.out.println("ang(b,c)=" + calcAng(b,c,a));
        }
        else System.out.println("impossivel");

    }
    public static int calcAng(int a, int b, int c){
        double r;
        r = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b)));
        return (int)r;
    }
}
