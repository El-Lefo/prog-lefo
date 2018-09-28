package Prog2.Trabajo.ejercicio2;

import Utilidad.Scanner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by a on 21/09/2018.
 */
public class Matriz {

    List <List <Integer>> listas;

    public Matriz(int filas, int columnas) {

        for (int i = 0; i < columnas; i++) {

            List <Integer> columnasMatriz = new ArrayList<>(filas);

            for (int j = 0; j < filas; j++) {

                columnasMatriz.add(Scanner.getInt("Ingrese el valor de la posicion " + j + filas + "de la matriz."));

            }

         listas.add(columnasMatriz);
        }
    }


    public int huecos () {

        int c = 0;
        int counter = 0;
        for (int i = 0; i < listas.size(); i++) {

            for (int j = 0; j < listas.get(j).size(); j++) {

                int valor = listas.get(j).get(c);
                if(valor == 0) {
                    counter = counter + valor;
                }
                c++;

            }

        }

        return counter;

    }


    public int sumaValores (){

        int c = 0;
        int counter = 0;
        for (int i = 0; i < listas.size(); i++) {

            for (int j = 0; j < listas.get(j).size(); j++) {

                int valor = listas.get(j).get(c);
                counter = counter + valor;
                c++;

            }

        }

        return counter;
    }



}
