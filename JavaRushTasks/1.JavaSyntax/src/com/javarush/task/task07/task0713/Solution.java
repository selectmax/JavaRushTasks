package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      ArrayList<Integer> list= new ArrayList<Integer>();
      ArrayList<Integer> mod3= new ArrayList<Integer>();
      ArrayList<Integer> mod2= new ArrayList<Integer>();
      ArrayList<Integer> modelse= new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++){
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
            if (list.get(i) % 3 == 0) mod3.add(list.get(i));
            if (list.get(i) % 2 == 0) mod2.add(list.get(i));
            if ((list.get(i) % 3 != 0) &&(list.get(i) % 2 != 0)) modelse.add(list.get(i));
        }
        printList(mod3);
        printList(mod2);
        printList(modelse);

    }

    public static void printList(List<Integer> list) {
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
