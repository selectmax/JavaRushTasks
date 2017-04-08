package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
     ArrayList<String> list = new ArrayList<String>();
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int dl=0;
    for (int i=0; i<10; i++){ list.add(reader.readLine());}
    for (int i=1; i<10; i++){
    if (list.get(i).length()<list.get(i-1).length()) {dl=i; break;}}
    if (dl!=0) System.out.println(dl);

    }
}

