package Prog1.Tp5;

import Utilidad.Scanner;

/**
 * Created by a on 27/04/2017.
 */

public class StringArrayUtil2 {

    public static void print (String[] strings){
        print(strings, 0);
    }

    private static void print(String[] strings, int i) {
        if (i < strings.length){
            if (strings[i] != null){
                System.out.println( i + ".\t" + strings[i]);
            }
        print(strings, i + 1);
        }
    }

    public static int indexOf (String[] strings, String string, int i){
        if (i < strings.length){
            if (string != null){
                if (string.equals(strings[i])){
                    return i;
                }
            }else if (strings[i] == null)
                return i;
        }
        indexOf(strings, string, i + 1);
        return -1;
    }

    public static int indexOf (String[] strings, String string ){
        return indexOf(strings, string, 0);
    }

    private static int indexOfEmpty (String[] strings){
        return indexOf(strings, null);
    }

    public static int put (String[] strings, String string){
        int position = indexOfEmpty(strings);
        if (position != -1){
            strings[position] = string;
            return position;
        }
        return position;
    }

    public static int remove (String string, String[] strings){
        return remove(string, strings, 0);
    }

    private static int remove (String string, String[] strings, int i){
        int counter = 0;
        if ((i = indexOf(strings, string, i)) != -1){
            strings [i++] = null;
            counter ++;
            remove(string, strings, i);
        }
        return counter;
    }

    public static String[] fillArray (String msg , int n){
        return fillArray(msg, n, 0);
    }

    private static String[] fillArray (String msg, int n, int i){
        String[] array = new String[n];
        if (i < n){
            array[i] = Scanner.getString(msg);
            i++;
            fillArray(msg, n, i);
        }
        return array;
    }

    }