package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }


    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        for (int i=0; i<20; i++){
            String s = reader.readLine();
            a[i] = Integer.parseInt(s);
        }
        return a;
    }

    public static int max(int[] array) {
        int maximum=array[0];
        for (int i=1; i<array.length; i++){
         if (array[i]>maximum) maximum=array[i];
        }// найди максимальное значение
        return maximum;
    }
}
