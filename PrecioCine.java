
import java.util.Scanner;

/*

Escribe un programa que calcule el precio de las entradas al cine basándose en la edad del usuario. Las reglas de precios son las siguientes:

	•	Menores de 5 años: Entrada gratis.
	•	Entre 5 y 12 años: 5 dólares.
	•	Entre 13 y 64 años: 10 dólares.
	•	65 años o más: 6 dólares.



 */
public class PrecioCine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad < 5) {
            System.out.println("Entrada gratis");
        }

        if (edad >= 5 && edad <= 12) {
            System.out.println("Paga 5 dólares");
        }

        if (edad >= 13 && edad <= 64) {
            System.out.println("Paga 10 dólares");
        }

        if (edad >= 65) {
            System.out.println("Paga 6 dolares");
        }

    }
}
