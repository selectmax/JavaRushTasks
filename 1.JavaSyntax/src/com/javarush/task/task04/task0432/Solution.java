package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        int i = 0;
        while (i < a) {
            System.out.println(s);
            i++;
        }

    }
}
