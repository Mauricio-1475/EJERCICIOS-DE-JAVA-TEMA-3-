import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();
        int i = 1;

        System.out.println("Números impares hasta " + n + ":");
        do {
            if (i % 2 != 0) System.out.println(i);
            i++;
        } while (i <= n);

        sc.close();
    }
}
