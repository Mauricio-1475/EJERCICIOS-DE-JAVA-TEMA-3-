import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double numero;

        System.out.println("Ingresa números positivos (número negativo para terminar):");

        do {
            System.out.print("Número: ");
            numero = sc.nextDouble();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }

        } while (numero >= 0);

        if (contador > 0) System.out.println("La media es: " + (suma / contador));
        else System.out.println("No se ingresaron números positivos.");

        sc.close();
    }
}
