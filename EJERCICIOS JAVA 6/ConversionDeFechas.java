import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConversionDeFechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una fecha (YYYY-MM-DD): ");
        String entrada = sc.nextLine().trim();

        DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE; // "YYYY-MM-DD"

        try {
            LocalDate fecha = LocalDate.parse(entrada, fmt);
            LocalDate unaSemanaDespues = fecha.plusWeeks(1);
            LocalDate unMesAntes = fecha.minusMonths(1);

            System.out.println("Fecha original:     " + fecha);
            System.out.println("Una semana después: " + unaSemanaDespues);
            System.out.println("Un mes antes:       " + unMesAntes);
        } catch (DateTimeParseException e) {
            System.out.println("Formato inválido. Usa YYYY-MM-DD, por ejemplo 2025-12-06");
        }

        sc.close();
    }
}
