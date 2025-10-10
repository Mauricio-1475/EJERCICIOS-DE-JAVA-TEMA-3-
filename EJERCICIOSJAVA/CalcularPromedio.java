import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Calcular promedio de 3 números ===");
            System.out.print("Ingrese el primer número: ");
            double a = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double b = sc.nextDouble();
            System.out.print("Ingrese el tercer número: ");
            double c = sc.nextDouble();

            double promedio = (a + b + c) / 3.0;
            System.out.printf("El promedio es: %.2f%n", promedio);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor ingrese números.");
        } finally {
            sc.close();
        }
    }
}
