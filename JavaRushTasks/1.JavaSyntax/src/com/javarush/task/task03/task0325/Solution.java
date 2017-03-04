package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String cost = reader.readLine();
        int money = Integer.parseInt(cost);
        System.out.println("Я буду зарабатывать $" +
                money +
                " в час");//напишите тут ваш код
    }
}
