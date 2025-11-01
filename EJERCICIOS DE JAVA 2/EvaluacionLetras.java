import java.util.Scanner;

public class EvaluacionLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu calificación numérica (0-100): ");
        int calificacion = sc.nextInt();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Tu calificación es: A");
        } else if (calificacion >= 80) {
            System.out.println("Tu calificación es: B");
        } else if (calificacion >= 70) {
            System.out.println("Tu calificación es: C");
        } else if (calificacion >= 60) {
            System.out.println("Tu calificación es: D");
        } else {
            System.out.println("Tu calificación es: F");
        }

        sc.close();
    }
}
