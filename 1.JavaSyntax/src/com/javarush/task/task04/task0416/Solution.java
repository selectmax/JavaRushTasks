package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        double t = Double.parseDouble(sAge);
        double modt = t % 5;
        if (modt < 3) System.out.println("зелёный");
        else if (modt < 4) System.out.println("желтый");
        else System.out.println("красный");//напишите тут ваш код
    }
}