package Pracitica.Generic.Con_T;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by a on 29/11/2017.
 */
public class Filter<T> {
    private List<Criteria<T>> criterios;

    public Filter() {
        criterios = new ArrayList<>();
    }

    public Collection<T> filter(Collection<T> coleccion) {
        List<T> filteredList = new ArrayList<T>();

        for (T element : coleccion) {
            boolean elementPassedAll = true;

            for (Criteria<T> criterio : criterios) {
                if (!criterio.evaluate(element)) {
                    elementPassedAll=false;
                    break;
                }
            }
            if (elementPassedAll) filteredList.add(element);
        }

        return filteredList;
    }

    public void addCriteria(Criteria<T> criteria) {
        criterios.add(criteria);
    }
}
