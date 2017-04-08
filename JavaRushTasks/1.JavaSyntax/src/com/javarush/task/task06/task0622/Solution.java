package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        String st;
        for (int i=0; i<5; i++){
        st = reader.readLine();
        a[i] = Integer.parseInt(st);
        }
        int b;
        for (int i=0; i<4; i++){
         for (int j=0; j<(4-i); j++){
             if (a[j]>a[j+1]) {b=a[j]; a[j]=a[j+1]; a[j+1]=b;}
         }
        }

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        //напишите тут ваш код
    }
}
