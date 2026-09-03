
package Actividad_2;

import java.util.Scanner;

/**
 *
 * @author LUIS ALEJANDRO ACUÑA
 */
public class ejercicio_2_NIVEL_INICIAL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hor; 
        System.out.println("que horas son? ");
        hor = sc.nextInt();
        if (hor>5 && hor<13){
            System.out.println("buenos dias!!");
    }
        else if (hor>12 && hor<21){
            System.out.println("buenas tardes!!");
}
        else if (hor>20){
            System.out.println("buenas noches!!");
    }
        else if (hor<6){
            System.out.println("buenas noches!!");
}
}
}