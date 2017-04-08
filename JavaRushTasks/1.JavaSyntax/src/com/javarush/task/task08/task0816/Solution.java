package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Maltsev", new Date("JANUARY 18 1995"));
        map.put("Wok", new Date("JULY 1 1980"));
        map.put("Ken", new Date("MARCH 1 1980"));
        map.put("Lay", new Date("JANUARY 1 1980"));
        map.put("Zou", new Date("AUGUST 1 1980"));
        map.put("Fon", new Date("JUNE 1 1980"));
        map.put("Mob", new Date("JULY 1 1980"));
        map.put("James", new Date("JULY 1 1980"));
        map.put("Bigdaadyy", new Date("JUNE 1 1980"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        GregorianCalendar g1=new GregorianCalendar();
        Iterator it1 = map.values().iterator();
        while (it1.hasNext())
        {
            g1.setTimeInMillis(((Date)it1.next()).getTime());
            int m = g1.get(Calendar.MONTH);
            if ((m>=5)&&(m<=7)) it1.remove();
        }

    }

    public static void main(String[] args) {

    }
}
