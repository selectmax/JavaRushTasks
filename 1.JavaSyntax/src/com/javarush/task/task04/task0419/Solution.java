package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();
        String num4 = reader.readLine();
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        int n4 = Integer.parseInt(num4);
        int max;
        if (n1>n2 && n1>n3 && n1>n4) max=n1;
           else if (n2>n3 && n2>n4) max=n2;
           else if (n3>n4) max=n3;
           else max=n4;
        System.out.println(max);
    }
}
