package Zcosas;

/**
 * Created by a on 21/06/2017.
 */
public class doubleArray {
    public static Object indexOf(Object[][] array, Object object){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals(object)){
                    return new doubleCoord(i, j);
                }
            }
        }
        return -1;
    }
}