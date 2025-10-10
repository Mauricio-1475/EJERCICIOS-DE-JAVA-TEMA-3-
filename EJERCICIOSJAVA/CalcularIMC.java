import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Índice de Masa Corporal (IMC) ===");
            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = sc.nextDouble();
            System.out.print("Ingrese su altura en metros (ej. 1.75): ");
            double altura = sc.nextDouble();

            if (peso <= 0 || altura <= 0) {
                System.out.println("Peso y altura deben ser mayores a 0.");
            } else {
                double imc = peso / (altura * altura);
                System.out.printf("Su IMC es: %.2f%n", imc);

                // Categoría opcional
                if (imc < 18.5) {
                    System.out.println("Categoría: Bajo peso");
                } else if (imc < 25) {
                    System.out.println("Categoría: Normal");
                } else if (imc < 30) {
                    System.out.println("Categoría: Sobrepeso");
                } else {
                    System.out.println("Categoría: Obesidad");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor ingrese números (decimales con punto).");
        } finally {
            sc.close();
        }
    }
}
