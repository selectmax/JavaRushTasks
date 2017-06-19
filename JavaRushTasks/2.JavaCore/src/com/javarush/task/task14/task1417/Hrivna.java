package com.javarush.task.task14.task1417;

/**
 * Created by max on 19.06.17.
 */
public class Hrivna extends Money {
    public String getCurrencyName(){
        return "HRN";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
