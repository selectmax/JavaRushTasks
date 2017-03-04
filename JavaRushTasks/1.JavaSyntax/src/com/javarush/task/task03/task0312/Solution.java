package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour)
    {
        return(hour * 3600);
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(20));
        System.out.println(convertToSeconds(30));//напишите тут ваш код
    }
}
