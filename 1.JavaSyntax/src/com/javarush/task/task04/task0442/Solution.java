package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        while (a != -1)
        {
        s = s + a;
        sAge = reader.readLine();
        a = Integer.parseInt(sAge);
        //System.out.println("s=" + a);
        }
        System.out.println(s-1);
    }
}
