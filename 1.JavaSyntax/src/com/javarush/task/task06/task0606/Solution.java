package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int num = Integer.parseInt(sAge);
        int numcopy = num;
        int q = num % 10; num = num/10;
        while (num > 0) {
           //System.out.println("Число для анализа - " + q);
           //System.out.println("В цикл вошли с num = " + num);
            if (q % 2 == 0) even++;
            else odd++;
            q = num % 10; num=num/10;
           // System.out.println("Even: " + even + " Odd: " + odd);
        }
        //System.out.println("Число для анализа q- " + q);
        //System.out.println("В цикл вошли с num = " + num);
        if (q % 2 == 0) even++;
        else odd++;
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
