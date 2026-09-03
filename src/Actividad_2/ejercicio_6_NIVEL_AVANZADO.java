/*
ejercicio 6 NIVEL AVANZADO:
Escribir un programa que muestre esto por pantalla:
*****
****
***
**
*
*/
package Actividad_2;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_6_NIVEL_AVANZADO {
    public static void main(String[] args) {
        int fil, ast;
        for ( fil = 5; fil >= 1; fil--) {
            for ( ast = 1; ast <= fil; ast++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
    

