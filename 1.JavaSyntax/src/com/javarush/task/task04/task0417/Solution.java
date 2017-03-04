package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge1 = reader.readLine();
        String sAge2 = reader.readLine();
        String sAge3 = reader.readLine();
        int num1 = Integer.parseInt(sAge1);
        int num2 = Integer.parseInt(sAge2);
        int num3 = Integer.parseInt(sAge3);
        if (num1 == num2 && num2 == num3) System.out.println(num1 + " " + num2 + " " + num3);
          else if (num1 == num2) System.out.println(num1 + " " + num2);
          else if (num2 == num3) System.out.println(num2 + " " + num3);
          else if (num1 == num3) System.out.println(num1 + " " + num3);



    }
}