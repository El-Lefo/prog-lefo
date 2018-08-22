package Prog1.Tp7;

/**
 * Created by a on 08/06/2017.
 */
public class StringList {

    // Elementos de la lista, puede tener lugares vacíos al final del array
    private String[] items;

    // Cantidad de lugares ocupados con valores distintos de null, empieza en 0
    private int size = 0;

    /** Inicializa items con un máximo de 10 lugares, comienza con sus lugares vacíos */
    public StringList() {
        items = new String[10];
    }

    /** Inicializa items con un máximo de n lugares, comienza con sus lugares vacíos */
    public StringList(int n) {
        items = new String[n];
    }

    /**
     * Agrega un String a la lista, en la primera posición disponible.
     * Si no hay más lugares vacíos al final del arreglo, agranda el arreglo con la siguiente lógica:
     * - Crear un nuevo arreglo del doble de tamaño que el arreglo items original
     * - Copie todos los valores del viejo arreglo de items al nuevo
     * - Asigne el nuevo arreglo a items
     */
    public void add(String item) {
        if (size < items.length) {
            items[size] = item;
            size++;
        }
        else {
            String[] temp = new String[items.length * 2];

        }
    }
    /**
     * Busca el elemento en la lista:
     * - Si lo encuentra retorna su posición
     * - De lo contrario retorna -1
     */


    /**
     * Elimina el String que este en la posición index de la lista:
     * - La lista NO deberá quedar con lugares vacíos en el medio.
     * - Los lugares vacíos deben estar todos al final.
     *
     * Ejemplos teniendo un StringList que contiene estos items ["a", "b", "c", null, null]:
     * - Luego de llamar a remove(2) sobre la lista, queda: ["a", "b", null, null, null]
     * - Luego de llamar a remove(0) sobre la lista, queda: ["b", "c", null, null, null]
     */

    /**
     * Retorna un String de la siguiente forma: ['a', 'b', 'c']
     * NO debe agregar al String los valores vacíos o null.
     *
     * Ejemplo:
     * - Teniendo un StringList con estos items ["a", "b", "c", null, null]
     * - El metodo toString devuelve: ['a', 'b', 'c']
     */


    /**
     * Retorna la cantidad de elementos que NO son nulos en el arreglo.
     * Solo los que tienen valor.
     *
     * Ejemplo:
     * - Teniendo un StringList con estos items ["a", "b", "c", null, null]
     * - El metodo size devuelve: 3
     */

}