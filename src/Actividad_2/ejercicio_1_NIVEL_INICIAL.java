//1er ejercicios de practica (nivel inicial)
/*Solicitar por teclado el radio de un círculo, guardarlo en un double, y calcular el área del círculo (el
area de un circulo es 2*PI*radio). Escribir luego el área por consola. Comprobar que sale con
decimales, si es que se da el caso.
*/
package Actividad_2;

import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_1_NIVEL_INICIAL {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
         double pi,ra,are;
         pi=3.14;
         System.out.println("Sistema para calcular el area de un circulo...");
         System.out.println("porfavor digite el radio de la circunferencia: ");
         ra=sc.nextDouble();
         are=2*pi*ra;
         System.out.println("el area de el circulo, deacuerdo a el radio introducido es: "+are);
    }
// el enunciado comete un error cuando dice que para calcular el area de un circulo es 2*PI*radio, la manera correcta es PI*ra al cuadrado
    //sin embargo, dejé la solución del codigo, respecto a lo que dice exactamente el enunciado
}
