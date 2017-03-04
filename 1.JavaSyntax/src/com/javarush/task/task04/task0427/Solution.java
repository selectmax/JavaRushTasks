package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        if (a > 0 && a < 1000)
        {
            if (a % 2 == 0) System.out.printf("четное ");
            else System.out.printf("нечетное ");
            if (a > 0 && a < 10) System.out.println("однозначное число");
            else if (a >= 10 && a < 100) System.out.println("двузначное число");
            else if (a >= 100 && a < 1000) System.out.println("трехзначное число");
        }
    }
}
