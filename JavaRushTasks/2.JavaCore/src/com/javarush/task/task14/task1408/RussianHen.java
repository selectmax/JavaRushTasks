package com.javarush.task.task14.task1408;

/**
 * Created by max on 19.06.17.
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 5;
    }
    public String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.RUSSIA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
