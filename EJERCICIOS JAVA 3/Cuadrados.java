import java.util.Scanner;

public class Cuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();
        int i = 1;

        System.out.println("Cuadrados desde 1 hasta " + n + ":");
        do {
            System.out.println(i + "^2 = " + (i * i));
            i++;
        } while (i <= n);

        sc.close();
    }
}
