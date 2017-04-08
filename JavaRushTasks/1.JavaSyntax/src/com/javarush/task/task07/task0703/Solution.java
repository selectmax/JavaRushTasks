package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
     int[] a = new int[10];
     String[] s = new String[10];
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     for (int i=0; i<s.length; i++){
         s[i] = reader.readLine();}
     for (int i=0; i<s.length; i++){
         a[i]=s[i].length();
     }
     for (int i=0; i<a.length; i++){
         System.out.println(a[i]);
     }
     //напишите тут ваш код
    }
}
