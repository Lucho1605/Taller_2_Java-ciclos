/*
ejercicio 4 NIVEL MEDIO: 
Escribir un programa que pida una base y un exponente (ambos números son enteros positivos) y que
calcule la potencia. Ejemplo, si se indica 3 y 4, nos da 81 de solución (3 elevado a 4, es 3*3*3*3).
*/
package Actividad_2;

import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_4_NIVEL_MEDIO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        double bas,exp; 
        System.out.println("digite la base: ");
        bas=sc.nextInt();
        System.out.println("digite el exponente: ");
        exp=sc.nextInt();
        double sol; 
        sol=Math.pow(bas, exp);
        System.out.println("el resultado es: "+sol);
    }
}
