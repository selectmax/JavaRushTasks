package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String size1 = reader.readLine();
        String size2 = reader.readLine();
        String size3 = reader.readLine();
        int s1 = Integer.parseInt(size1);
        int s2 = Integer.parseInt(size2);
        int s3 = Integer.parseInt(size3);
        boolean i = true;
        if (s1 >= s2+s3) i = false;
          else if (s2 >= s1 + s3) i = false;
             else if (s3 >= s1 + s2) i = false;
        if (i) System.out.println("Треугольник существует.");
         else System.out.println("Треугольник не существует.");
    }
}