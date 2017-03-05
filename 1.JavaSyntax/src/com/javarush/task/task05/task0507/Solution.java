package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        int kolvo = 1;
        int sum = 0;
        while (a != -1) {
           sum +=a;
            sAge = reader.readLine();
            a = Integer.parseInt(sAge);
            kolvo++;
        }
        System.out.println((double)sum/(double)(kolvo-1));//напишите тут ваш код
    }
}

