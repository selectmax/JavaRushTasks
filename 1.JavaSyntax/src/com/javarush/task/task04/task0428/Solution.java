package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
       for (int i=0; i < 3; i++) {
           String sAge = reader.readLine();
           a[i] = Integer.parseInt(sAge);
       }
       int s = 0;
       for (int i=0; i<3; i++){
           if (a[i] > 0 ) s++;
       }
        System.out.println(s);
    }
}
