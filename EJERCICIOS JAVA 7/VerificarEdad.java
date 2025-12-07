import java.util.Scanner;

public class VerificarEdad {

    public static boolean puedeVotar(int edad) {
        return edad >= 18;  // devuelve true o false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (puedeVotar(edad)) {
            System.out.println("Sí puedes votar.");
        } else {
            System.out.println("No puedes votar.");
        }

        sc.close();
    }
}
