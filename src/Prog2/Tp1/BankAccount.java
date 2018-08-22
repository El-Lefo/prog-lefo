package Prog2.Tp1;

import java.util.Random;

public class BankAccount {

    private double balance;
    private int cbu;

    public BankAccount(){
        balance = 0;
        cbu = new Random().nextInt(100000000);
    }

    public void deposit(double ammount) throws InvalidDepositException {
        if (ammount > 0)
            balance += ammount;
        else
            throw new InvalidDepositException("No se puede depositar una cantidad negativa");
    }

    public void withdraw(double ammount) throws InvalidDepositException {
        if (ammount > 0)
            balance -= ammount;
        else
            throw new InvalidDepositException("No se puede retirar una cantidad negativa");
    }

    public int getCbu() {
        return cbu;
    }

    public double getBalance() {
        return balance;
    }


    public class InvalidDepositException extends Throwable {
        public InvalidDepositException(String s) {
            System.out.println(s);
        }
    }
}
