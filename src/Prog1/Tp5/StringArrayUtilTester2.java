package Prog1.Tp5;

import Utilidad.Scanner;

/**
 * Created by a on 27/04/2017.
 */
public class StringArrayUtilTester2 {

    public static void main(String[] args) {
        String[] array = StringArrayUtil2.fillArray("Ingrese un String: ", 5);
        String str;
        if(StringArrayUtil2.indexOf(array, (str = Scanner.getString("Ingrese un string a buscar en el arreglo: "))) != -1) {
            System.out.println("el string existe en el arreglo");
            StringArrayUtil2.remove(str, array);
        }
        StringArrayUtil2.put(array, Scanner.getString("ingrese un string a ubicar en el arreglo: "));
        StringArrayUtil2.print(array);
    }
}
