import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        System.out.println("Ingresa 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        sc.close();
    }
}
