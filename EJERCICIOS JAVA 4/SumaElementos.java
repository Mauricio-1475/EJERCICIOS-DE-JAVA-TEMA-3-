import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingresa 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("\nLa suma total de los elementos es: " + suma);

        sc.close();
    }
}
