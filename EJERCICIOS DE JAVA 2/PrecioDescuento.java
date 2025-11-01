import java.util.Scanner;

public class PrecioDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio original del producto: ");
        double precio = sc.nextDouble();

        double descuento;
        if (precio <= 100) descuento = 0;
        else if (precio <= 200) descuento = 0.10;
        else if (precio <= 500) descuento = 0.20;
        else descuento = 0.25;

        double precioFinal = precio - (precio * descuento);

        System.out.printf("El precio final con descuento es: $%.2f\n", precioFinal);

        sc.close();
    }
}
