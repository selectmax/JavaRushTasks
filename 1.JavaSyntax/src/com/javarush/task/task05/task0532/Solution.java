package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];
if (n>0) for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if (a[i] > maximum) {maximum = a[i];
               // System.out.println("Максимум обновлен");
                }
        }

        System.out.println(maximum);
    }
}
