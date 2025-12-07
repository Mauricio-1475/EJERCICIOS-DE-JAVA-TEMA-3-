import java.util.Scanner;

public class ComparacionDeCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String a = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String b = sc.nextLine();

        // Comparar longitudes
        if (a.length() == b.length()) {
            System.out.println("Las dos cadenas tienen la misma longitud (" + a.length() + " caracteres).");
        } else {
            System.out.println("Las cadenas tienen longitudes diferentes: " + a.length() + " y " + b.length());
        }

        // Comparar contenido exacto (sensible a mayúsculas/minúsculas)
        if (a.equals(b)) {
            System.out.println("El contenido es exactamente igual (incluyendo mayúsculas/minúsculas).");
        } else if (a.equalsIgnoreCase(b)) {
            System.out.println("Los contenidos son iguales ignorando mayúsculas/minúsculas.");
        } else {
            System.out.println("Los contenidos son diferentes.");
        }

        sc.close();
    }
}
