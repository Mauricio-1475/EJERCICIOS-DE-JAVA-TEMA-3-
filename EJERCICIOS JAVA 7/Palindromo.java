import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");

        String invertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        return texto.equals(invertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

        sc.close();
    }
}
