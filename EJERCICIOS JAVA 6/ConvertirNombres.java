import java.util.Scanner;

public class ConvertirNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombres completos en minúsculas. Escribe 'salir' para terminar.");

        while (true) {
            System.out.print("Nombre completo: ");
            String linea = sc.nextLine().trim();
            if (linea.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado.");
                break;
            }
            // Convertir a mayúsculas (respeta acentos y caracteres locales)
            String enMayus = linea.toUpperCase();
            System.out.println("En MAYÚSCULAS: " + enMayus);
        }

        sc.close();
    }
}
