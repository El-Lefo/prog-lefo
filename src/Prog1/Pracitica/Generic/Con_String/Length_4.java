package Pracitica.Generic.Con_String;

import Pracitica.Generic.Con_T.Criteria;

/**
 * Created by a on 29/11/2017.
 */
public class Length_4 implements Criteria<String> {
    @Override
    public boolean evaluate (String element) {
        return element.length() > 4;
    }
}
