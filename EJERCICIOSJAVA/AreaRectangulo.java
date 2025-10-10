import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Área de un rectángulo ===");
            System.out.print("Ingrese la base (metros): ");
            double base = sc.nextDouble();
            System.out.print("Ingrese la altura (metros): ");
            double altura = sc.nextDouble();

            if (base < 0 || altura < 0) {
                System.out.println("La base y la altura deben ser valores no negativos.");
            } else {
                double area = base * altura;
                System.out.printf("El área del rectángulo es: %.2f metros cuadrados.%n", area);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor ingrese números (decimales con punto).");
        } finally {
            sc.close();
        }
    }
}

