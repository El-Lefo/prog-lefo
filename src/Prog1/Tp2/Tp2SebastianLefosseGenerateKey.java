package Prog1.Tp2;

import Utilidad.Scanner;

/**
 * Created by a on 06/04/2017.
 */
public class Tp2SebastianLefosseGenerateKey {

    public static void main (String[] args) {

        String apellido = Scanner.getString("Ingrese su apellido (minimo 3 letras): ");
        String nombre = Scanner.getString("Ingrese su nombre (minimo 3 letras): ");

        String primeraLetra = apellido.substring(0,1);
        String hue = primeraLetra.toLowerCase();
        String m = "m";
        int j = hue.compareTo(m);

        System.out.println(j);

        String letrasApellido = apellido.substring(0,3);
        String letrasNombre = nombre.substring(nombre.length()-3, nombre.length());

        System.out.println("Clave formada: " + letrasApellido + letrasNombre);
    }
}
