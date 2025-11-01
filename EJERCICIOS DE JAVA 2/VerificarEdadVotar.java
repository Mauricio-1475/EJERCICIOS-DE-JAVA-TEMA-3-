import java.util.Scanner;

public class VerificarEdadVotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("✅ Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("❌ No puedes votar todavía. La edad mínima es 18 años.");
        }

        sc.close();
    }
}
