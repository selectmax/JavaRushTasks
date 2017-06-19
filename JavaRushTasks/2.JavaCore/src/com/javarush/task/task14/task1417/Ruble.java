package com.javarush.task.task14.task1417;

/**
 * Created by max on 19.06.17.
 */
public class Ruble extends Money {
    public String getCurrencyName(){
        return "RUB";
    }

    public Ruble(double amount) {
        super(amount);
    }
}
