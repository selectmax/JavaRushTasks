package com.javarush.task.task14.task1420;
import java.io.*;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = reader.readLine();
        String string2 = reader.readLine();
        int num1 = Integer.parseInt(string1);
        int num2 = Integer.parseInt(string2);
        if ((num1<=0)||(num2<=0)) throw new Exception();
        else {
        if (num1>num2) {
            int forChange = num1;
            num1=num2;
            num2=forChange;
        }
        int NOD=1;
        for (int i=1; i<=num1; i++) {
            if ((num1 % i == 0)&&(num2 % i ==0)) {
                NOD = i;
            }
        }
        System.out.println(NOD);}
    }
}
