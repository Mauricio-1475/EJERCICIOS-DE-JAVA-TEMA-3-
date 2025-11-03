import java.util.Scanner;

public class VocalOConsonante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.println("Ingresa letras (un espacio para terminar):");

        do {
            System.out.print("Letra: ");
            letra = sc.next().charAt(0);

            if (letra == ' ') break;

            if ("aeiouAEIOU".indexOf(letra) != -1) System.out.println("Vocal");
            else System.out.println("Consonante");

        } while (true);

        sc.close();
    }
}
