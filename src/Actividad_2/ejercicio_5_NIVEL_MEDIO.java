/*
ejercicio 5 NIVEL MEDIO: 
Hacer un programa que pide un número al usuario, y escribe en pantalla el mes correspondiente a tal
número (si el usuario introduce 2, el programa escribe “Febrero”). Si el numero no es válido, lo indica
igualmente. Tras ello, se le pregunta al usuario si quiere repetir, y si dice “si”, se vuelve a repetir el
proceso anterior
*/
package Actividad_2;

import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_5_NIVEL_MEDIO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int num;
        char res;
        do{
        System.out.println("digita un numero para saber el mes: ");
        num=sc.nextInt();
        if (num==1){
            System.out.println("es el mes de Enero!!");
        }
        if (num==2){
            System.out.println("es el mes de Febrero!!");
    }
        if (num==3){
            System.out.println("es el mes de Marzo!!");
}
        if (num==4){
            System.out.println("es el mes de Abril!!");
        }
        if (num==5){
            System.out.println("es el mes de Mayo!!");
        }
        if (num==6){
            System.out.println("es el mes de Junio!!");
        }
        if (num==7){
            System.out.println("es el mes de Julio!!");
        }
        if (num==8){
            System.out.println("es el mes de Agosto!!");
        }
        if (num==9){
            System.out.println("es el mes de Septiembre!!");
        }
        if (num==10){
            System.out.println("es el mes de Octubre!!");
        }
        if (num==11){
            System.out.println("es el mes de Noviembre!!");
        }
        if (num==12){
            System.out.println("es el mes de Diciembre!!");
        }
        else if (num>12){
            System.out.println("numero invalido");
    }
            System.out.println("quieres volver a intentarlo? (si o no) ");
        res = sc.next().toLowerCase().charAt(0);
            System.out.println();
            
        } while (res == 's');

        System.out.println("Programa finalizado. ¡Hasta luego!");
}
}

