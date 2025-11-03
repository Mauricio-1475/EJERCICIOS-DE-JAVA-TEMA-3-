import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();
        int contador = 0;
        int num = Math.abs(numero); // Para números negativos

        if (num == 0) contador = 1;
        while (num > 0) {
            num /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");
        sc.close();
    }
}
