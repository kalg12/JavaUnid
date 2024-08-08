import java.util.Scanner;

/*
Escribe un programa que solicite al usuario ingresar su peso en kilogramos y su altura en metros, y 
luego calcule su Índice de Masa Corporal (IMC). Con base en el IMC, determina si la persona está bajo peso, 
en peso normal, sobrepeso u obesa.

Fórmulas y categorías:

	•	IMC = peso / (altura * altura)
	•	Bajo peso: IMC < 18.5
	•	Peso normal: 18.5 <= IMC < 24.9
	•	Sobrepeso: 25 ≤ IMC < 29.9
	•	Obesidad: IMC >= 30

*/

public class CalcularImcPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso actual en kilogramos: ");
        float pesoKilos = scanner.nextFloat();
        System.out.print("Ingrese su estatura en metros actual: ");
        float metrosEstatura = scanner.nextFloat();
        
        float calculoImc = pesoKilos / (metrosEstatura * metrosEstatura);
        
        if(calculoImc < 18.5){
            System.out.println("Su IMC es de " + calculoImc + " usted está bajo de peso");
        }
        
        if(18.5 <= calculoImc && calculoImc < 24.9){
            System.out.println("Su IMC es de " + calculoImc + " usted tiene un peso normal");
        }
        
        if(25 <= calculoImc && calculoImc < 29.9 ){
            System.out.println("Su IMC es de " + calculoImc + " usted tiene sobrepeso");
        }
        
        if(calculoImc >= 30){
            System.out.println("Su IMC es de " + calculoImc + " usted tiene obesidad");
        }  
    }
}
