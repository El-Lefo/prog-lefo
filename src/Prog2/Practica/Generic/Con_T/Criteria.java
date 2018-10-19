package Pracitica.Generic.Con_T;

/**
 * Created by a on 29/11/2017.
 */
public interface Criteria<T> {
    boolean evaluate(T element);
        }