import java.util.Scanner;

public class ConvertidorGrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Selecciona una opción:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("%.2f °C equivalen a %.2f °F\n", celsius, fahrenheit);
            }
            case 2 -> {
                double kelvin = celsius + 273.15;
                System.out.printf("%.2f °C equivalen a %.2f K\n", celsius, kelvin);
            }
            default -> System.out.println("Opción inválida.");
        }

        sc.close();
    }
}
