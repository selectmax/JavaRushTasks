package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);    //напишите тут ваш код
        if (a==0) System.out.println("ноль");
        else {
            if (a > 0) System.out.printf("положительное ");
                else System.out.printf("отрицательное ");
            if (a % 2 == 0) System.out.printf("четное число");
               else System.out.printf("нечетное число");
        }
    }
}
