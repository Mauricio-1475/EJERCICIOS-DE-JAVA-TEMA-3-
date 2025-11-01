import java.util.Scanner;

public class EstacionDelAnio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = sc.nextInt();
        String estacion;

        switch (mes) {
            case 12, 1, 2 -> estacion = "Invierno";
            case 3, 4, 5 -> estacion = "Primavera";
            case 6, 7, 8 -> estacion = "Verano";
            case 9, 10, 11 -> estacion = "Otoño";
            default -> estacion = "Mes inválido";
        }

        System.out.println("La estación del año es: " + estacion);

        sc.close();
    }
}
