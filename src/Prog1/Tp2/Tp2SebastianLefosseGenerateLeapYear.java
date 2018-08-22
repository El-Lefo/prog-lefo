package Prog1.Tp2;

import Utilidad.Scanner;

/**
 * Created by a on 06/04/2017.
 */
public class Tp2SebastianLefosseGenerateLeapYear {

    public static void main (String[] args){

        int year = Scanner.getInt("ingrese un Año: ");
        boolean leap = isLeapYear(year);

        if (leap) {  System.out.println("Es bisiesto!");  }

        else {  System.out.println("No es bisiesto!");  }

    }

    public static boolean isLeapYear (int year) {
       return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}
