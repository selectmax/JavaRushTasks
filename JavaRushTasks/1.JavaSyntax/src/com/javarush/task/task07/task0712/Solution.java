package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list= new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10; i++){
            list.add(reader.readLine());}
        int min=50000;
        int max=0;
        int nmin=0, nmax = 0;
        for (int i=9; i>=0; i--){
            if (list.get(i).length()>=max) { max=list.get(i).length(); nmax=i;}
               else if (list.get(i).length()<=min) { min=list.get(i).length(); nmin=i;}
        }
        if (nmax <= nmin) System.out.println(list.get(nmax));
           else System.out.println(list.get(nmin));

    }
}
