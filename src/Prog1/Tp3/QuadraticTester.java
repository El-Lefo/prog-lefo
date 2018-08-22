package Prog1.Tp3;

import Utilidad.Scanner;

/**
 * Created by a on 20/04/2017.
 */
public class QuadraticTester {

    public static void main (String[] args){

        double a = Scanner.getDouble("Ingrese el coeficiente X² de la ecuación: ");
        double b = Scanner.getDouble("Ingrese el coeficiente X de la ecuación: ");
        double c = Scanner.getDouble("Ingrese el término independiente de la ecuación: ");

        Quadratic q1 = new Quadratic(a, b, c);
        System.out.println("\n" + q1.roots());

        double x = Scanner.getDouble("\nIngrese un parámetro X: ");
        System.out.println("\n" + q1.valueY(x));

        double y = Scanner.getDouble("\nIngrese un parámetro Y: ");
        System.out.println("\n" + q1.valueX(y));

        q1.printString();

        q1.printDerivation();
    }
}
