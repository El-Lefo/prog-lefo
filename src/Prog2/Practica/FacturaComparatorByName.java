package Prog2.Practica;

import java.util.Comparator;

/**
 * Created by a on 29/11/2017.
 */
public class FacturaComparatorByName implements Comparator <Factura> {
    @Override
    public int compare(Factura o1, Factura o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
}
