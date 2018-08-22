package Prog1.Tp4;

import Utilidad.Scanner;

/**
 * Created by a on 27/04/2017.
 */
public class StringArrayUtilTester {

    public static void main(String[] args) {
        String[] array = StringArrayUtil.fillArray("Ingrese un String: ", 5);
        String str;
        if(StringArrayUtil.indexOf(array, (str = Scanner.getString("Ingrese un string a buscar en el arreglo: "))) != -1) {
            System.out.println("el string existe en el arreglo");
            StringArrayUtil.remove(str, array);
        }
        StringArrayUtil.put(Scanner.getString("ingrese un string a ubicar en el arreglo: "), array);
        StringArrayUtil.print(array);
    }
}
