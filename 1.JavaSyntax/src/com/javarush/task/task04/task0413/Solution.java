package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int num = Integer.parseInt(number);  //напишите тут ваш код
        if (num <=0 || num > 7) System.out.println("такого дня недели не существует");
           else if (num == 1) System.out.println("понедельник");
           else if (num == 2) System.out.println("вторник");
           else if (num == 3) System.out.println("среда");
           else if (num == 4) System.out.println("четверг");
           else if (num == 5) System.out.println("пятница");
           else if (num == 6) System.out.println("суббота");
           else if (num == 7) System.out.println("воскресенье");
    }
}