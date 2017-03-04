package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String chislo = reader.readLine();
        String name = reader.readLine();

        int nAge = Integer.parseInt(chislo);
        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!"); //напишите тут ваш код
    }
}
