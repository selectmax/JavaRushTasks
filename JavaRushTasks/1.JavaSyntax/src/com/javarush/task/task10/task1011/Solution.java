package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        s=s+" ";
        ArrayList<Character> list = new ArrayList<Character>();
       for (int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        Character letter = 'a';
        int count = -1;

try{
        while (list.size() != 1){
            while (letter != ' '){
                count+=1;
                letter=list.get(count);
            }
           for (int i=0; i<count; i++){
                for (int j=0; j<list.size()-1; j++){
                    System.out.printf(String.valueOf(list.get(j)));
                }
               System.out.println("");
            }
            for (int i=0; i<count+1; i++){
               list.remove(0);
           }
           letter='a';
            count = -1;
        }

    } catch (IndexOutOfBoundsException e) {
        System.out.println(e);
    }

}}

