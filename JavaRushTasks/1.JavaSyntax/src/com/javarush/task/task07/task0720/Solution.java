package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nstring = reader.readLine();
        String mstring = reader.readLine();
        int n = Integer.parseInt(nstring);
        int m = Integer.parseInt(mstring);
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<n; i++){
            list.add(reader.readLine());
        }
        for (int i=0; i<m; i++){
            list.add(list.get(0));
            list.remove(0);
        }
        for (int i=0; i<n; i++){
            System.out.println(list.get(i));
        }
    }
}
