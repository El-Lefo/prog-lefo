
package Prog2.Clase;

/**
 * Created by a on 07/09/2018.
 */
public class Rango {

    int start;
    int end;


    public Rango  (int start, int end) {

        this.start = start;
        this.end = end;

        int [] rango = new int[end];

        for (int i = 0 ; i < end ; i++ ){

            rango[i] = start;
            start++;

        }

        System.out.println(rango);

    }


    public void replace (int [] arreglo, int a, int b) {

        if (a > arreglo.length){
            System.out.println("No existe esa posición en el arreglo.");
        }
        else
            arreglo [a] = b;
    }


    public int position (int [] arreglo, int a){

        int b = 0;

        for (int i = 0 ; i < arreglo.length ; i++){

            if (arreglo[i] == a) {
                b = i;
                i = arreglo.length;
            }

        }

        return b;

    }


}
