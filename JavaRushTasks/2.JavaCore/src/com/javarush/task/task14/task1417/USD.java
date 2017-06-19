package com.javarush.task.task14.task1417;

import javafx.scene.input.Mnemonic;

/**
 * Created by max on 19.06.17.
 */
public class USD extends Money {
    public String getCurrencyName(){
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }
}
