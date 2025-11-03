import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2;

        do {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = sc.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = sc.nextDouble();

                switch (opcion) {
                    case 1: System.out.println("Resultado: " + (num1 + num2)); break;
                    case 2: System.out.println("Resultado: " + (num1 - num2)); break;
                    case 3: System.out.println("Resultado: " + (num1 * num2)); break;
                    case 4: 
                        if (num2 != 0) System.out.println("Resultado: " + (num1 / num2));
                        else System.out.println("Error: División entre cero");
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida");
            }

        } while (opcion != 5);

        sc.close();
    }
}
