package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
    int a = number % 10;
    int b = number / 10;
    b = b % 10;
    int c = number / 100;

        return(a + b + c);//напишите тут ваш код
    }
}