package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     int[] a = new int[10];
     int[] b = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            String st = reader.readLine();
            a[i] = Integer.parseInt(st);}
        for (int i=0; i<10; i++){
            b[i]=a[i];
        }
        for (int i=0; i<10; i++){
            a[i]=b[a.length-i-1];
            System.out.println(a[i]);
        }
        //напишите тут ваш код
    }
}

