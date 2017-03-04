package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        if (nAge >=0) nAge = nAge * 2;
            else nAge = nAge + 1;
        System.out.println(nAge);

        //напишите тут ваш код

    }

}