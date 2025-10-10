import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularSalarioNeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Cálculo de salario neto ===");
            System.out.print("Ingrese el salario bruto mensual: ");
            double salarioBruto = sc.nextDouble();

            System.out.print("Ingrese el porcentaje de impuestos (por ejemplo 16 para 16%): ");
            double porcentajeImpuestos = sc.nextDouble();

            System.out.print("Ingrese las deducciones adicionales: ");
            double deducciones = sc.nextDouble();

            if (salarioBruto < 0 || porcentajeImpuestos < 0 || deducciones < 0) {
                System.out.println("Los valores no pueden ser negativos.");
            } else {
                double impuesto = salarioBruto * (porcentajeImpuestos / 100.0);
                double salarioNeto = salarioBruto - impuesto - deducciones;

                System.out.printf("Impuesto calculado: %.2f%n", impuesto);
                System.out.printf("Salario neto: %.2f%n", salarioNeto);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor ingrese números válidos.");
        } finally {
            sc.close();
        }
    }
}
