package Prog1.Tp4;

import Utilidad.Scanner;

public class StringArrayUtil {

    public static void print (String[] strings) {
        for (int i = 0 ; i < strings.length ; i ++){
            if (strings[i] != null)
                System.out.println( i + ".\t" + strings[i]);
        }
    }

    public static int indexOf (String[] strings, String string, int i) {
        for ( ; i < strings.length ; i ++)
            if(string != null) {
                if (string.equals(strings[i]))
                    return i;
            }else if(strings[i] == null)
                return i;
        return -1;
    }

    public static int indexOf (String[] strings, String string ){
        return indexOf(strings, string, 0);
    }

    public static int indexOfEmpty (String[] strings){
        return indexOf(strings, null);
    }

    public static int put (String string, String[] strings){
        int position = indexOfEmpty(strings);
        if (position != -1){
            strings[position] = string;
            return position;
        }
        return position;
    }

    public static int remove (String string, String[] strings){
        int counter = 0;
        int a = 0;
        while ((a = indexOf(strings, string, a))!= -1){
            strings[a++] = null;
            counter++;
        }
        return counter;
    }

    public static String[] fillArray (String msg , int n){
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = Scanner.getString(msg);
        }
        return array;
    }

}