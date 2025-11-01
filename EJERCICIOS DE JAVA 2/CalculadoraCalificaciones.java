import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la calificación de los parciales (0-100): ");
        double parciales = sc.nextDouble();
        System.out.print("Ingresa la calificación del proyecto (0-100): ");
        double proyecto = sc.nextDouble();
        System.out.print("Ingresa la calificación del examen final (0-100): ");
        double examen = sc.nextDouble();

        if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examen < 0 || examen > 100) {
            System.out.println("⚠️ Las calificaciones deben estar entre 0 y 100.");
        } else {
            double notaFinal = (parciales * 0.4) + (proyecto * 0.3) + (examen * 0.3);
            System.out.printf("La calificación final del estudiante es: %.2f\n", notaFinal);
        }

        sc.close();
    }
}
