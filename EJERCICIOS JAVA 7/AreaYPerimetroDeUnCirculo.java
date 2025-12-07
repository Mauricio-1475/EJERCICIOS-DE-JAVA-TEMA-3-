import java.util.Scanner;

public class AreaYPerimetroDeUnCirculo {

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);

        sc.close();
    }
}
