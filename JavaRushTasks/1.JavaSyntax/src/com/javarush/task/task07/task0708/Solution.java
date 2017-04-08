package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
     ArrayList<String> list = new ArrayList();
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int max=0;
     for (int i=0; i<5; i++) {
         list.add(reader.readLine());
         if (list.get(i).length()>max) max=list.get(i).length();
     }
     for (int i=0; i<5; i++){
         if (list.get(i).length()==max) System.out.println(list.get(i));
     }

    }
}
