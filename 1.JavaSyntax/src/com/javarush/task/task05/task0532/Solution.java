package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;
        int n = Integer.parseInt(reader.readLine());
       if (n>0) {int[] a = new int[n];
        for (int i=0; i<a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if (a[i] > maximum) {maximum = a[i];
               // System.out.println("Максимум обновлен");
                }
        }

        System.out.println(maximum);}

    }
}
