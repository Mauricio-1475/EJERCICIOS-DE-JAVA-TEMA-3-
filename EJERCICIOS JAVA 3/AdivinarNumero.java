import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 100:");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) System.out.println("Demasiado bajo.");
            else if (intento > numeroSecreto) System.out.println("Demasiado alto.");
            else System.out.println("¡Correcto! El número es " + numeroSecreto);

        } while (intento != numeroSecreto);

        sc.close();
    }
}
