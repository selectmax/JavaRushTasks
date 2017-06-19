package com.javarush.task.task14.task1408;

/**
 * Created by max on 19.06.17.
 */
public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 235;
    }
    public String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
