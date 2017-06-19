package com.javarush.task.task14.task1408;

/**
 * Created by max on 19.06.17.
 */
public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 63;
    }
    public String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.UKRAINE +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
