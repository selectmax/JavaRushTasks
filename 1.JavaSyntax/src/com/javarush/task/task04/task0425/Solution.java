package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int x = Integer.parseInt(num1);   //напишите тут ваш код
        int y = Integer.parseInt(num2);   //напишите тут ваш код
        int a = 0;
        if (x > 0 && y > 0) a = 1;
        else if (x < 0 && y > 0) a = 2;
        else if (x< 0 && y < 0) a = 3;
        else if (x > 0 && y < 0) a = 4;
        System.out.println(a);
    }
}
