import java.util.Scanner;

public class BrindarInformacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige un tipo de información:");
        System.out.println("1. Artista");
        System.out.println("2. Película");
        System.out.println("3. Serie");
        System.out.println("4. Videojuego");
        System.out.println("5. Banda musical");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Bad Bunny: Cantante y compositor puertorriqueño conocido por su estilo urbano y fusiones latinas.");
            case 2 -> System.out.println("Interestelar: Película dirigida por Christopher Nolan sobre viajes espaciales y la relatividad del tiempo.");
            case 3 -> System.out.println("Breaking Bad: Serie sobre un profesor de química que se convierte en fabricante de metanfetamina.");
            case 4 -> System.out.println("The Legend of Zelda: Videojuego clásico de aventura y exploración desarrollado por Nintendo.");
            case 5 -> System.out.println("Maná: Banda mexicana de pop-rock reconocida internacionalmente por canciones como 'Rayando el sol'.");
            default -> System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
