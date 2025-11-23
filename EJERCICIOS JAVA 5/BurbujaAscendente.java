import java.util.Scanner;

public class BurbujaAscendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pedir tamaño del arreglo
        System.out.print("Ingresa la cantidad de elementos del arreglo: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // 2. Llenar el arreglo con números ingresados por el usuario
        System.out.println("Ingresa los " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // 3. Método de ordenamiento burbuja (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambio
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // 4. Mostrar el arreglo ordenado
        System.out.println("\nArreglo ordenado en forma ascendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println(); // Salto de línea final
    }
}
