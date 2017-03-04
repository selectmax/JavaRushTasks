package com.javarush.task.task04.task0408;

/* 
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a > 5) System.out.println("Число больше 5");//напишите тут ваш код
        else if (a < 5) System.out.println("Число меньше 5");//напишите тут ваш код
        else if (a == 5) System.out.println("Число равно 5");//напишите тут ваш код
    }
}