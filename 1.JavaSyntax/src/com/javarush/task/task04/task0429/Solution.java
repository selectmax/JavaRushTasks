package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] q = new int[3];
        int c = 0;
        int b = 0;
        for (int i=0; i < 3; i++) {
            String sAge = reader.readLine();
            q[i] = Integer.parseInt(sAge);
            if (q[i]<0) c++;
              else if (q[i]>0) b++; }
        System.out.println("количество отрицательных чисел: " + c);
        System.out.println("количество положительных чисел: " + b);
    }
}
