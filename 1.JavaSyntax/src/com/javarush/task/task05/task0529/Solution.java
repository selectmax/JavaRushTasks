package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int n = Integer.parseInt(a);
        int sum=0;

        while (!(a.equals("сумма"))) {
         sum +=n;
          //  System.out.println("sum=" + sum);
         a = reader.readLine();
         if (!(a.equals("сумма"))) n = Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
