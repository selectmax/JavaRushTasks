package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        if (Craten(nAge, 400)) System.out.println("количество дней в году: 366");
        else if (Craten(nAge, 100)) System.out.println("количество дней в году: 365");
        else if (Craten(nAge, 4)) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");

    }

    public static boolean Craten(int god, int cratenna) {
        if (god % cratenna == 0) return true;
        else return false;}
}