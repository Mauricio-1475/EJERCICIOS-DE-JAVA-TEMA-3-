import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = sc.nextInt();

        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();

            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números iguales a 0: " + ceros);

        sc.close();
    }
}
