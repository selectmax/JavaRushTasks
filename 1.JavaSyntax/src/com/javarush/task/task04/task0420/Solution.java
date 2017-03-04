package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();
        Integer[] mass = new Integer[3];
        mass[0] = Integer.parseInt(num1);
        mass[1] = Integer.parseInt(num2);
        mass[2] = Integer.parseInt(num3);
        System.out.println("0check:" + mass[2] + " " + mass[1] + " " + mass[0]);
    if (mass[0]>mass[1]) Change(mass[0],mass[1]);
        System.out.println("1check:" + mass[2] + " " + mass[1] + " " + mass[0]);
    if (mass[1]>mass[2]) Change(mass[1],mass[2]);
        System.out.println("2check:" + mass[2] + " " + mass[1] + " " + mass[0]);
    if (mass[0]>mass[1]) Change(mass[0],mass[1]);
        System.out.println(mass[2] + " " + mass[1] + " " + mass[0]);
    }
    public static void Change(Integer a, Integer b){

        Integer c = a;
        a = b;
        b = c; }
}
