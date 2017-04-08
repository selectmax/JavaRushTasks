package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        s="";
        s = s + Character.toUpperCase(chars[0]);
        for (int i=1; i<chars.length; i++){
        if (chars[i-1] == ' ') s = s + Character.toUpperCase(chars[i]);
        else s=s+chars[i];
        }
        System.out.println(s);
        //напишите тут ваш код
    }
}
