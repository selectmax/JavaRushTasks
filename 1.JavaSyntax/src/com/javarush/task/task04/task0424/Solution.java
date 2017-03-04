package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c1 = reader.readLine();
        String c2 = reader.readLine();
        String c3 = reader.readLine();
        int a0 = Integer.parseInt(c1);    //напишите тут ваш код
        int a1= Integer.parseInt(c2);    //напишите тут ваш код
        int a2 = Integer.parseInt(c3);    //напишите тут ваш код
        if (a0 == a1) if (a0 != a2) System.out.println(3);
        if (a2 == a1) if (a0 != a2) System.out.println(1);
        if (a0 == a2) if (a0 != a1) System.out.println(2);
    }
}
