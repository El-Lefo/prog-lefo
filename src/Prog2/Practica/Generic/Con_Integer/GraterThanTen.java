package Pracitica.Generic.Con_Integer;

import Pracitica.Generic.Con_T.Criteria;

/**
 * Created by a on 29/11/2017.
 */
public class GraterThanTen implements Criteria<Integer> {

    @Override
    public boolean evaluate (Integer element){
        return element > 10;
    }
}
