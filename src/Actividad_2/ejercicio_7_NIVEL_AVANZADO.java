/* 
ejercicio 7 NIVEL AVANZADO:
3.c.10.Escribir un programa que muestre esto por pantalla:
1
121
12321
1234321
*/
package Actividad_2;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_7_NIVEL_AVANZADO {
    public static void main(String[] args) {
        int tot = 4,fil,j; 
        for ( fil = 1; fil <= tot; fil++) {
            for ( j = 1; j <= fil; j++) {
                System.out.print(j);
            }
            for ( j = fil - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

