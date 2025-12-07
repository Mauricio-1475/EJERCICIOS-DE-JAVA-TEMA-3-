import java.text.Normalizer;
import java.util.Scanner;

public class ManipulacionDeTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";

        System.out.println("Escribe varias líneas. Para terminar escribe la palabra FIN en una nueva línea:");

        while (true) {
            String linea = sc.nextLine();

            if (linea.equalsIgnoreCase("FIN")) {
                break;
            }

            texto += linea + " ";
        }

        // MOSTRAR LO QUE REALMENTE RECIBIÓ LA CONSOLA
        System.out.println("\n--- TEXTO ORIGINAL QUE RECIBIÓ LA CONSOLA ---");
        System.out.println(texto);

        // Normalizamos (quitamos acentos y pasamos a minúsculas)
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                                            .replaceAll("\\p{M}", "")
                                            .toLowerCase();

        System.out.println("\n--- TEXTO DESPUÉS DE QUITAR ACENTOS Y PASAR A MINÚSCULAS ---");
        System.out.println(textoNormalizado);

        // Contar "ingenieria"
        String palabra = "ingenieria";
        int contador = 0;
        int index = textoNormalizado.indexOf(palabra);

        while (index != -1) {
            contador++;
            index = textoNormalizado.indexOf(palabra, index + 1);
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("La palabra 'ingeniería' aparece " + contador + " veces.");

        sc.close();
    }
}


