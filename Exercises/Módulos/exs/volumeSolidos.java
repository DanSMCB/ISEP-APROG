import java.util.Scanner;
public class volumeSolidos {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        String solido;
        float raio, altura;
        do{
            solido = ler.next();
            if (solido.equals("cilindro")){
                raio = ler.nextFloat();
                altura = ler.nextFloat();
                System.out.printf("%.2f",volCilindro(raio,altura));
                System.out.println();
            }
            else {
                if(solido.equals("cone")){
                    raio = ler.nextFloat();
                    altura = ler.nextFloat();
                    System.out.printf("%.2f",volCone(raio,altura));
                    System.out.println();
                }
                else {
                    if(solido.equals("esfera")){
                        raio = ler.nextFloat();
                        System.out.printf("%.2f",volEsfera(raio));
                        System.out.println();
                    }
                }
            }
        }while(!solido.equals("fim"));
    }
    public static float volCilindro(double raio, double altura){
        double vol = Math.PI*Math.pow(raio,2)*altura;
        return (float) vol;
    }
    public static double volCone(double raio, double altura){
        double vol = (1.00/3)*(Math.PI*Math.pow(raio,2)*altura);
        return (float) vol;
    }
    public static double volEsfera(double raio){
        double vol = (4.00/3)*(Math.PI*Math.pow(raio,3));
        return (float) vol;
    }
}