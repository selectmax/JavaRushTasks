package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String firstAge = reader.readLine();
        String secondAge = reader.readLine();
        int fAge = Integer.parseInt(firstAge);
        int sAge = Integer.parseInt(secondAge);
        System.out.println(name +" получает " + fAge +" через " + sAge + "лет.");//напишите тут ваш код
    }
}
