package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        boolean fl=true;
        String chislo=reader.readLine();
        if (chislo!="end") {
                        while (fl) {
                            list.add(chislo);
                            chislo = reader.readLine();
                            if (chislo.equals("end")) fl=false;
                        }
                        }
    for (int i=0; i<list.size(); i++){
        System.out.println(list.get(i));}
    }
}