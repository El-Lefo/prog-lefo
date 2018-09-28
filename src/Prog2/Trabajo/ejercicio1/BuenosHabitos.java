package Prog2.Trabajo.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) Los principales comportamientos principales son:
 *
 *  - La suma de los puntos obtenidos.
 *  - Niveles obtenidos segun el habito.
 *  - Actividades completadas.
 *  - usuarios existentes.
 *  - Actividades de cada habito.
 *
 */
public class BuenosHabitos {

    List <List <String>> habitos;

    public BuenosHabitos () {

        habitos = new ArrayList<> (6);

        for (int i = 0; i < habitos.size(); i++) {

            habitos.add(new ArrayList <>(2));
        }

        for (int i = 0; i < habitos.size(); i++) {

            habitos.get(i).add(Ejercicios);
        }

    }


}
