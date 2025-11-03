import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int inicio = sc.nextInt();
        System.out.print("Ingresa la diferencia: ");
        int diferencia = sc.nextInt();
        System.out.print("Ingresa el número máximo: ");
        int max = sc.nextInt();

        int actual = inicio;

        System.out.println("Secuencia aritmética:");
        do {
            System.out.println(actual);
            actual += diferencia;
        } while (actual <= max);

        sc.close();
    }
}
