package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l = (long) 111_1111_111_110L;
        int x = (int) 0b1000_1100_1010;
        double m = (double) 110_987_654_6299.123_34;
        float f = (float) l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}