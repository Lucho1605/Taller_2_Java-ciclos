/*
Ejercicio 3 NIVEL MEDIO.
   Programa que pide por teclado 5 números, y en el caso en el que el primero introducido sea igual al
último, nos muestra la media de ambos. En caso contrario, no se mostrará nada.
*/
package Actividad_2;

import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
    public class ejercicio_3_NIVEL_MEDIO {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in); 
            double pri=0;
            double ult=0;
            System.out.println("por favor introduce 5 numeros: ");
             for (int cic  = 1; cic <= 5; cic++) {
                System.out.print("Número " + cic + ": ");
                double act = sc.nextDouble();

             if (cic == 1){
                 pri=act;
        }
             if  (cic==5) {
                 ult=act;
    }
    }
             if (pri==ult){
             System.out.println("el primer numero que digitó y el ultimo son iguales...");
             double media;
             media=(pri+ult)/2;
             System.out.println("la media de entre el primer y ultimo numero es: "+media);
        }
    }
        
    }