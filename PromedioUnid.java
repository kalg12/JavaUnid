import java.util.Scanner;

/*

Escribe un programa que calcule la calificación final de un estudiante en función de sus 
calificaciones en tres parciales. Los dos primeros parciales valen el 30% de la calificación 
final cada uno, y el último parcial vale el 40%.

Requisitos del Ejercicio

	1.	Solicitar al usuario las calificaciones de los tres parciales.
	2.	Calcular la calificación final basada en los porcentajes asignados a cada parcial.
	3.	Mostrar la calificación final del estudiante.


*/

public class PromedioUnid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primerParcial, segundoParcial, tercerParcial;
        double calificacionFinal;
        String excelente = "Excelente";
        String muyBien = "Muy bien";
        String regular = "Regular";
        String malo = "Malo";
        
        System.out.println("Ingresa calificación del primer parcial");
        primerParcial = sc.nextInt();
        
        System.out.println("Ingresa calificación del segundo parcial");
        segundoParcial = sc.nextInt();
        
        System.out.println("Ingresa calificación del tercer parcial");
        tercerParcial = sc.nextInt();
        
        calificacionFinal = (primerParcial * 0.30) + (segundoParcial * 0.30) + ( tercerParcial * 0.40);
        
        System.out.println("Tu promedio final es: " + calificacionFinal);
   
        // colocar tipos de categoría : Excelente, bueno, regular y malo
        if (calificacionFinal == 100) {
            System.out.println(excelente);
        }
        if (calificacionFinal <= 99 && calificacionFinal >= 80){
            System.out.println(muyBien);
        }
        if (calificacionFinal <= 79 && calificacionFinal >= 60){
            System.out.println(regular);
        } else {
            System.out.println(malo);        
        }
    }
}
