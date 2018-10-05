package Prog2.Clase.Guardian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by a on 28/09/2018.
 */
public class Guardian < T > {

    List < T > accepted;
    HashMap < Criteria < T > , List < T > > rejected;
    List < Criteria < T > > criterios;

    public Guardian () {

        accepted = new ArrayList < T >();
        rejected = new HashMap <>();
        criterios = new ArrayList <>();

    }

    public void accepts (T enter) {



    }

    public void addCriteria (Criteria < T > criteria) {

        criterios.add(criteria);

    }

    public void removeCriteria (Criteria < T > criteria) {

        criterios.remove(criteria);

    }
}
