import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        double pesos = sc.nextDouble();

        System.out.println("Selecciona la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        int moneda = sc.nextInt();

        double resultado = 0;

        switch (moneda) {
            case 1 -> resultado = pesos / 19.0;   // Dólar estadounidense
            case 2 -> resultado = pesos / 20.5;   // Euro
            case 3 -> resultado = pesos * 1.89;   // Bath tailandés
            case 4 -> resultado = pesos * 8.34;   // Yen japonés
            case 5 -> resultado = pesos * 75.32;  // Won surcoreano
            case 6 -> resultado = pesos / 12.3;   // Dólar australiano
            case 7 -> resultado = pesos / 5.2;    // Sol peruano
            case 8 -> resultado = pesos / 14.2;   // Dólar canadiense
            case 9 -> resultado = pesos * 1.52;   // Bolívar venezolano
            case 10 -> resultado = pesos * 20.3;  // Peso argentino
            default -> System.out.println("Opción no válida.");
        }

        if (resultado > 0) {
            System.out.printf("Equivalente: %.2f\n", resultado);
        }

        sc.close();
    }
}
