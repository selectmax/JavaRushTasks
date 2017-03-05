package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mAge = reader.readLine();
        String nAge = reader.readLine();
        int m = Integer.parseInt(mAge);
        int n = Integer.parseInt(nAge);
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.printf("8");
            }
            System.out.println("");
        }

    }
}
