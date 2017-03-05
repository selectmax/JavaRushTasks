package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) throws Exception {
   int i = 1, j = 1;
   while (i <= 10) { j = 1;
       while (j <= 10) {
           System.out.printf(i*j + " ");
           j++;
       }
       System.out.println("");
       i++;
   }

    }
}
