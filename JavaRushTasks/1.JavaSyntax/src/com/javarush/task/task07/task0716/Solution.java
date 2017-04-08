package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("поза"); //3
        list.add("мор"); //4
        list.add("вал"); //5
        list.add("лось"); //2
        list.add("лира"); //2
        list.add("рок"); //2
        list.add("лом"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i=0; i<list.size(); ){
            if (list.get(i).contains("р") && list.get(i).contains("л")) {i++;} //ignore
            else if (list.get(i).contains("р")) {list.remove(i);
                System.out.println("Удалено");}
            else if (list.get(i).contains("л")) {list.add(i, list.get(i));
                System.out.println("Продублировано" + list.get(i)); i=i+2;}
            else i++;
        }
        return list;
    }
}